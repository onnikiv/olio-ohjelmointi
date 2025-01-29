package task02;

public class SportsCar extends Car {
    public SportsCar(String typeName, double maxSpeed) {
        super(typeName, maxSpeed);
        this.speedChange = 6;
        this.fuelConsumption = 1.5;
    }
}