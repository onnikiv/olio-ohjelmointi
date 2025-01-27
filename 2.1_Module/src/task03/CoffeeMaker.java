package task03;

public class CoffeeMaker {

    public enum CoffeeType {
        normal, espresso
    }

    private CoffeeType coffeeType;
    private int coffeeAmount;
    private boolean power;

    public void coffeeMaker(CoffeeType coffeeType, int coffeeAmount) {
        this.coffeeType = coffeeType;
        this.coffeeAmount = coffeeAmount;
        this.power = false;
    }

    public void powerButton() {
        this.power = !this.power;
        if (this.power) {
            System.out.println("Coffee maker is on");
        } else {
            System.out.println("Coffee maker is off");
        }
    }

    public void setType(CoffeeType coffeeType) {
        if (this.power == true) {
            this.coffeeType = coffeeType;
            System.out.println("Coffee type is " + this.coffeeType);
        } else {
            System.out.println("Error // Power");
        }
    }

    public void getCoffeeType() {
        System.out.println(this.coffeeType);
    }

    public void setAmount(int coffeeAmount) {
        if (this.power == true) {
            if (10 <= coffeeAmount && coffeeAmount <= 80) {
                this.coffeeAmount = coffeeAmount;
                System.out.println("Coffee amount is " + this.coffeeAmount + " ml");
            } else {
                System.out.println("Error // Coffee amount");
            }
        } else {
            System.out.println("Error // Power");
        }
    }

    public void getCoffeeAmount() {
        System.out.println(this.coffeeAmount);
    }
}
