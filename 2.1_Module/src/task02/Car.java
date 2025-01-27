package task02;

public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;

    // Tehtävänannon mukaan muokattu vain task02.Car luokkaa. main osiossa "testialustus oliolle"
    // tankCapacity + topSpeed
    private double tankCapacity;
    private double topSpeed;

    // tankCapacity ja topSpeed argumentit lisätty konstruktoriin
    // nyt voidaan olion alustamisessa määrittää nuo arvot
    public Car(String typeName, double tankCapacity, double topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }

    
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
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
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }

    public static void main(String[] args) {
        // testialustus
        Car car = new Car("Volkswagen Polo", 60, 225);
    }
}