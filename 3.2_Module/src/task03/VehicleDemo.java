package task03;

public class VehicleDemo {

    public static void main(String[] args) {

        Car car = new Car("Petrol", "Red");
        Bus bussi = new Bus("Diesel", 40);
        Motorcycle mopo = new Motorcycle("Gasoline", "Orange");   
        
        ElectricCar sähköauto = new ElectricCar();
        ElectricMotorcycle sähkömopedi = new ElectricMotorcycle();
        
        car.getInfo();
        bussi.getInfo();
        mopo.getInfo();
        sähköauto.getInfo();
        sähkömopedi.getInfo();

        car.charge();
        bussi.charge();
        mopo.charge();
        sähköauto.charge();
        sähkömopedi.charge();

        System.out.println();
        
        car.start();
        bussi.start();
        mopo.start();
        sähköauto.start();
        sähkömopedi.start();

        System.out.println();

        car.calculateFuelEfficiency();
        bussi.calculateFuelEfficiency();
        mopo.calculateFuelEfficiency();
        sähköauto.calculateFuelEfficiency();
        sähkömopedi.calculateFuelEfficiency();

        System.out.println();
    }
}
