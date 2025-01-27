package task04;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Volskwagen Polo", 125);
       
        myCar.fillTank();

        myCar.cruiseControl(60);
        System.out.println("Speed now: " + myCar.getSpeed() + " km/h");

        myCar.cruiseControl(30);
        System.out.println("Speed now: " + myCar.getSpeed() + " km/h");
        


    }
}