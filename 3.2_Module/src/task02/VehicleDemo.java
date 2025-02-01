package task02;

public class VehicleDemo {

    public static void main(String[] args) {

        Car car = new Car("Petrol", "Red");
        Motorcycle mopo = new Motorcycle("Gasoline", "Orange");   
        Bus bussi = new Bus("Diesel", 40);

        car.getInfo();
        System.out.println();

        mopo.getInfo();
        System.out.println();
        
        bussi.getInfo();

    }
}
