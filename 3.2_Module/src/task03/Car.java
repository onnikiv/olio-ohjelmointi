package task03;

public class Car extends AbstrackVehicle {

    Car(String fuel, String color) {
        super(VehicleType.Car);
        this.fuel = fuel;
        this.color = color;
        
        //task 4
        this.fuelEfficiency = 100 / 6; // 100km / 6litraa 
    }

    @Override
    public void getInfo() {
        System.out.println(type + " information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println();
    }

    //task 4
    @Override
    public void calculateFuelEfficiency() {
        System.out.print(type + " -- ");
        System.out.println("Fuel efficiency: " + fuelEfficiency + " km per liter");
        
    }
}