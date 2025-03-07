package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.CurrencyDao;
import entity.Currency;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CurrencyController {

    private CurrencyDao currencyDao;

    private List<Currency> currencies;
    private int CURRENCYCOUNT;

    @FXML
    private TextField currencyAmount;

    @FXML
    private Text errorMessageText;

    @FXML
    private Text currencyNameFrom;

    @FXML
    private Text currencyNameTo;
    
    @FXML
    private ChoiceBox<Object> initialCurrency;
    
    @FXML
    private ChoiceBox<Object> convertToCurrency;


    public void initialize() {
        
        currencyDao = new CurrencyDao();
        currencies = new ArrayList<>();
        
        
        try {
            System.out.println("Currencies lista luotu");
            populateChoiceBoxes();
            System.out.println("Choiceboxit täytetty");

            // handlerit -> saadaan valuutan nimi textiboxeihin
            initialCurrency.setOnAction(event -> setCurrencyNameToBox());
            convertToCurrency.setOnAction(event -> setCurrencyNameToBox());
            
            errorMessageText.setText("Connection Succesful!\nCurrencies have been added.");
            
        } catch (Exception e) { errorMessageText.setText("Connection Failed!\nCouldn't fetch Currencies.");
    System.out.println(e.getMessage());}
    }

    private void setCurrencyNameToBox() {
        String fromCurrencyCode = (String) initialCurrency.getValue();
        String toCurrencyCode = (String) convertToCurrency.getValue();
        
        for (Currency currency : currencies) {
            if (currency.getCurrencyCode().equals(fromCurrencyCode)) {
                currencyNameFrom.setText(currency.getCurrencyName());
            }
            if (currency.getCurrencyCode().equals(toCurrencyCode)) {
                currencyNameTo.setText(currency.getCurrencyName());
            }
        }
    }

    public void populateChoiceBoxes() {
        try {
            currencies = currencyDao.findAll();
            CURRENCYCOUNT = currencies.size();
            System.out.println("CURRENCYCOUNT: " + CURRENCYCOUNT);

            for (Currency currency : currencies) {
                initialCurrency.getItems().add(currency.getCurrencyCode());
                convertToCurrency.getItems().add(currency.getCurrencyCode());
            }
        } catch (Exception e) {
            System.err.println("Error populating choice boxes: " + e.getMessage());
        }
    }

    public void convertCurrency() {
        try {

            double amount = Double.parseDouble(currencyAmount.getText()); 
            
            if (amount >= 0) {
                
                double from = 0;
                double to = 0;

                for (Currency currency : currencies) {
                    if (currency.getCurrencyCode().equals(initialCurrency.getValue())) {
                        from = currency.getConversionRate();
                    }
                    if (currency.getCurrencyCode().equals(convertToCurrency.getValue())) {
                        to = currency.getConversionRate();
                    }
                }

                double convertedAmount = amount * (to / from);
                
                if (from != 0 && to != 0) {
                    errorMessageText.setText(String.format("%.2f %s equals to\n %.2f %s", amount, 
                    initialCurrency.getValue(), convertedAmount, convertToCurrency.getValue()));
                
                } else {errorMessageText.setText("Please Select The Currencies");}

            } else {errorMessageText.setText("Number Must Be Positive!.");}
            
        } catch (NumberFormatException e) {
            errorMessageText.setText("Please Enter A Number.");
        }
    }

    public void addNewCurrency() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/addWindow.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        // KUN IKKUNA SULJETAAN PÄIVITETÄÄN VALUUTTALISTA
        stage.setOnHiding(event -> updateMainWindow());
    }
    private void updateMainWindow() {

        // tyhjätään lista, ja sitten uudestaan täytetään
        initialCurrency.getItems().clear();
        convertToCurrency.getItems().clear();
        populateChoiceBoxes();
        errorMessageText.setText("Currencies updated.");
    }
}
