package task01;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Car", "Petrol", "Red");
        Vehicle vehicle2 = new Motorcycle("Motorcyle", "Gasoline", "Black");
        Vehicle vehicle3 = new Bus("Bus", "Diesel", 40);

        System.out.println();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.getInfo();

        System.out.println();
        vehicle2.start();
        vehicle2.stop();
        vehicle2.getInfo();

        System.out.println();
        vehicle3.start();
        vehicle3.stop();
        vehicle3.getInfo();
    }

}
