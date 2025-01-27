package task04;

public class Car {

    private double speed;
    private double gasolineLevel;
    private final String typeName;
    private double maxSpeed;
    private boolean cruiseControlStatus;

    public Car(String typeName, double maxSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.maxSpeed = maxSpeed;
        this.cruiseControlStatus = false;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 1;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    public void cruiseControl(int targetSpeed) {
        this.cruiseControlStatus = true;

        if (targetSpeed > 0 && targetSpeed <= this.maxSpeed) {

            if (this.cruiseControlStatus == true) {
                System.out.println("Cruise ON");

                if (targetSpeed > speed) {

                    while (speed != targetSpeed) {
                        accelerate();
                        System.out.println("Accelerating:  >> " + getSpeed());
                    }
                    System.out.println("Target Speed Reached.");

                } else if (targetSpeed < speed) {
                    while (targetSpeed < speed) {
                        decelerate(1);
                        System.out.println("Decelerating:  >> " + getSpeed());
                    }
                    System.out.println("Target Speed Reached.");
                }

            } else {
                System.out.println("Cruise OFF");
                this.cruiseControlStatus = false;
            }

        } else {
            System.out.println("Error, Cruise OFF");
            this.cruiseControlStatus = false;
        }
    }
}
