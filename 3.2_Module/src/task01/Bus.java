package task01;

public class Bus implements Vehicle {

    private final String type;
    private final String fuel;
    private final int capacity;

    Bus(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;

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
    public void getInfo() {
        System.out.println(type + " information: ");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + capacity + " passengers");
    }
}
