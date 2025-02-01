package task3and4;

interface Vehicle {
    void start();
    void stop();
    void getInfo();

    // task 4 
    void calculateFuelEfficiency();
}

interface ElectricVehicle {
    void charge();
}
    

public abstract class AbstrackVehicle implements Vehicle, ElectricVehicle {

    protected enum VehicleType {
        Car, Bus, Motorcycle,
        ElectricCar, ElectricMotorcycle
    }

    protected VehicleType type;
    protected String fuel;
    protected String color;

    // task 4
    protected double fuelEfficiency;

    AbstrackVehicle(VehicleType type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public abstract void getInfo();

    @Override
    public void charge() {
        System.out.println("Not possible to charge: " + type);
    }

    // task 4
    @Override
    public abstract void calculateFuelEfficiency();
}
