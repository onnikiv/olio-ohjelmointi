package task01;

public class Car {
    protected String typeName;
    protected double maxSpeed;
    protected double speed;
    protected double gasolineLevel;
    protected double speedChange = 1;
    protected double fuelConsumption = 0.5;

    public Car(String typeName, double maxSpeed) {
        this.typeName = typeName;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.gasolineLevel = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed = Math.min(maxSpeed, speed + speedChange);
            gasolineLevel = Math.max(0, gasolineLevel - fuelConsumption);
            
            if (speed == maxSpeed) {
                System.out.println("Max speed reached!");
            }
            if (gasolineLevel == 0) {
                speed = 0;
                System.out.println("Ran out of gas!");
            }
        } else {
            speed = 0;
            System.out.println("No gas!");
        }
    }

    public void decelerate(int amount) {
        if (amount > 0) {
            speed = Math.max(0, speed - amount * speedChange);
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }
}


