package task01;

public class SportsCar extends Car {
    public SportsCar(String typeName, double maxSpeed) {
        super(typeName, maxSpeed);
        this.speedChange = 6;
        this.fuelConsumption = 1.5;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Volskwagen Polo", 125);
        SportsCar notMySportsCar = new SportsCar("Ferrari", 300);

        myCar.fillTank();
        notMySportsCar.fillTank();
        System.out.println(notMySportsCar.getTypeName() +": Speed now: " + notMySportsCar.getSpeed() + " km/h, gas: " + notMySportsCar.getGasolineLevel());
        System.out.println(myCar.getTypeName() +": Speed now: " + myCar.getSpeed() + " km/h, gas: " + myCar.getGasolineLevel());

        for (int i = 0; i < 50; i++) {
            notMySportsCar.accelerate();
            myCar.accelerate();
        }
        
        System.out.println();
        System.out.println(notMySportsCar.getTypeName() +": Speed now: " + notMySportsCar.getSpeed() + " km/h, gas: " + notMySportsCar.getGasolineLevel());
        System.out.println(myCar.getTypeName() +": Speed now: " + myCar.getSpeed() + " km/h, gas: " + myCar.getGasolineLevel());

    }
}