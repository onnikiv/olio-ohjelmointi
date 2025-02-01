public class Car implements Vehicle {

    private final String type;
    private final String fuel;
    private final String color;

    Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;

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
        System.out.println("Color: " + color);
    }
}
