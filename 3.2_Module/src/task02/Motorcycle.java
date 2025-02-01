package task02;

public class Motorcycle extends AbstrackVehicle {

    Motorcycle(String fuel, String color) {
        super(VehicleType.Motorcycle, fuel);
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println(type + " information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
    }
}
