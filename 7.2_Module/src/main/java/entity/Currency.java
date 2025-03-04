package entity;

public class Currency {

    private final String currencyCode, currencyName;
    private final double conversionRate;
    private final int id;

    public Currency(int id, String currencyCode, String currencyName, double conversionRate) {
        this.id = id;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.conversionRate = conversionRate;
    }
    
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    public String getCurrencyName() {
        return currencyName;
    }
    
    public double getConversionRate() {
        return conversionRate;
    }

    public int getId() {
        return id;
    }
    
}
