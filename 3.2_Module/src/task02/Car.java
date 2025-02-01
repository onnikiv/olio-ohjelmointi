package task02;

public class Car extends AbstrackVehicle {

    Car(String fuel, String color) {
        super(VehicleType.Car, fuel);
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
