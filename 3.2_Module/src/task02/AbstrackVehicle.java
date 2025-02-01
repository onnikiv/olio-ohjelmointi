package task02;

public abstract class AbstrackVehicle implements Vehicle {

    protected enum VehicleType {
        Car, Bus, Motorcycle
    }

    protected VehicleType type;
    protected String fuel;
    protected String color;

    AbstrackVehicle(VehicleType type, String fuel) {
        this.type = type;
        this.fuel = fuel;
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
}
