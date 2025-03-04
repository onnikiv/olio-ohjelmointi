package controller;

import java.util.ArrayList;

import dao.CurrencyDao;
import entity.Currency;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CurrencyController {

    private ArrayList<Currency> currencies;

    private CurrencyDao currencyDao;

    @FXML
    private TextField currencyAmount;

    @FXML
    private Text errorMessageText;
    
    @FXML
    private ChoiceBox<Object> initialCurrency;
    
    @FXML
    private ChoiceBox<Object> convertToCurrency;

    @FXML
    public void initialize() {
        try {
            currencyDao = new CurrencyDao();
            currencies = new ArrayList<>();
            populateChoiceBoxes();
            
            errorMessageText.setText("Connection Succesful!\nCurrencies have been added.");
            
        } catch (Exception e) { errorMessageText.setText("Connection Failed!\nCouldn't fetch Currencies.");}
    }

    @FXML
    public void populateChoiceBoxes() {
        for (int i = 1; i <= currencyDao.getCurrencyCountDB(); i++) {

            Currency currency = currencyDao.getCurrency(i);
            currencies.add(currency);

            initialCurrency.getItems().add(currency.getCurrencyCode());
            convertToCurrency.getItems().add(currency.getCurrencyCode());
        }
    }

    @FXML
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
}
