package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="currencyCode")
    private String currencyCode;
    
    @Column(name="currencyName")
    private String  currencyName;


    private double conversionRate;

    public Currency(int id, String currencyCode, String currencyName, double conversionRate) {
        super();
        this.id = id;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.conversionRate = conversionRate;
    }

    public Currency() {
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

    public void setCurrencyCode(String CODE) {
        this.currencyCode = CODE;
    }

    public void setCurrencyName(String NAME) {
        this.currencyName = NAME;
    }

    public void setConversionRate(double RATE) {
        this.conversionRate = RATE;
    }
}
