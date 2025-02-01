package task03;

public class ElectricCar extends AbstrackVehicle {

    ElectricCar() {
        super(VehicleType.ElectricCar);
        this.fuel = "Electricity";
        
        //task 4
        this.fuelEfficiency = 100 / 15;

    }

    @Override
    public void getInfo() {
        System.out.println(type + " information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println();
    }

    @Override
    public void charge() {
        System.out.println(type + " is now charging");
    }

    //task 4
    @Override
    public void calculateFuelEfficiency() {
        System.out.print(type + " -- ");
        System.out.println("Fuel efficiency: " + fuelEfficiency + " km per liter");
        
    }
}