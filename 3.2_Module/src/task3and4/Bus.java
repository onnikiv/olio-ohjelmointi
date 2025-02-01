package task3and4;

public class Bus extends AbstrackVehicle {

    private final int capacity;

    Bus(String fuel, int capacity) {
        super(VehicleType.Bus);
        this.fuel = fuel;
        this.capacity = capacity;
        
        //task 4
        this.fuelEfficiency = 100 / 25;
    }

    @Override
    public void getInfo() {
        System.out.println(type + " information: ");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + capacity + " passengers");
        System.out.println();
    }

    //task 4
    @Override
    public void calculateFuelEfficiency() {
        System.out.print(type + " -- ");
        System.out.println("Fuel efficiency: " + fuelEfficiency + " km per liter");
        
    }
}