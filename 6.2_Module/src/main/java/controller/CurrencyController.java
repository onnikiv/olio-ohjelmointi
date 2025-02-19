package controller;

import model.CurrencyModel;
import view.CurrencyView;


public class CurrencyController {

    private final CurrencyView currencyView;
    private final CurrencyModel currencyModel;

    public CurrencyController(CurrencyView currencyView) {
        this.currencyView = currencyView;
        this.currencyModel  = new CurrencyModel();
    }

    public void convertCurrencies() {
        // jos molemmat tuottaa tulosta niin jippii
        if (checkInput() && checkCurrencies() == true) {
            
            String from = currencyView.convertFrom();
            String To = currencyView.convertTo();
            int input = Integer.parseInt(currencyView.amountOf());

            currencyView.setResult(this.currencyModel.exchangeCurrency(input, from, To));
        }
    }

    public boolean checkInput() {
        try {
            int input = Integer.parseInt(currencyView.amountOf());
            return input >= 0;
        } catch (NumberFormatException e) {
            return false;
        }  
    }

    public boolean checkCurrencies() {

        String from = currencyView.convertFrom();
        String To = currencyView.convertTo();
        return from != null && To != null;
    }
}
