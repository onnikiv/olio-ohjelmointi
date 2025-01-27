package task03;

import task03.CoffeeMaker.CoffeeType;

public class CoffeeMakerDriver {

    public static void main(String[] args) {
        CoffeeMaker moccaMaster = new CoffeeMaker();

        moccaMaster.powerButton();
        moccaMaster.setType(CoffeeType.espresso);
        moccaMaster.setAmount(50);
        moccaMaster.powerButton();
    }

}
