package controller;

import dao.CurrencyDao;
import entity.Currency;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AddController {

    private final CurrencyDao currencyDao = new CurrencyDao();

    @FXML
    private TextField currencyFromAdd;
    @FXML
    private TextField currencyToAdd;
    @FXML
    private TextField currencyConversionAdd;
    @FXML
    private Text AddErrorBox;

    
    public void commitToDB() {
        System.out.println("Button Pressed");

        try {
            String currencyCode = currencyFromAdd.getText();
            String currencyName = currencyToAdd.getText();
            double conversionRate = Double.parseDouble(currencyConversionAdd.getText());

            if (currencyCode == null || currencyCode.isEmpty() ||
                currencyName == null || currencyName.isEmpty()) {
                AddErrorBox.setText("All fields must be filled.");
                return;
            }


            addCurrencyToDatabase(currencyCode, currencyName, conversionRate);

        } catch (NumberFormatException e) {
            AddErrorBox.setText("Invalid conversion rate format.");
            System.err.println("NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            AddErrorBox.setText("An error occurred: " + e.getMessage());
            System.err.println("Exception: " + e.getMessage());
        } finally {
            
        }
    }

    public void addCurrencyToDatabase(String currencyCode, String currencyName, double conversionRate) {
        try {
            Currency currency = new Currency();
            currency.setCurrencyCode(currencyCode);
            currency.setCurrencyName(currencyName);
            currency.setConversionRate(conversionRate);
            currencyDao.persist(currency);
            System.out.println("Currency Successfully added to Database!: " + currency.getCurrencyCode());
            AddErrorBox.setText("Currency Successfully added to Database!:" + currency.getCurrencyCode());

        } catch (Exception e) {
            AddErrorBox.setText("Failed to add currency to database: ");
        }
    }

}
