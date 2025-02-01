package task3and4;

public class Motorcycle extends AbstrackVehicle {

    Motorcycle(String fuel, String color) {
        super(VehicleType.Motorcycle);
        this.fuel = fuel;
        this.color = color;

        //task 4
        this.fuelEfficiency = 100 / 4;
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
