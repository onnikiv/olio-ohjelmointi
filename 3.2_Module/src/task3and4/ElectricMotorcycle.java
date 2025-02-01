package task3and4;

public class ElectricMotorcycle extends AbstrackVehicle {

    ElectricMotorcycle() {
        super(VehicleType.ElectricMotorcycle);
        this.fuel = "Electricity";

        //task 4
        this.fuelEfficiency = 100 / 20;
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
