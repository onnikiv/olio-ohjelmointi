package task02;

public class Bus extends AbstrackVehicle {

    private final int capacity;

    Bus(String fuel, int capacity) {
        super(VehicleType.Bus, fuel);
        this.capacity = capacity;
    }

    @Override
    public void getInfo() {
        System.out.println(type + " information: ");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + capacity + " passengers");
    }
}
