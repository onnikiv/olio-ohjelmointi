package task02;

public class Bus extends Car {
    private int passengers;
    private int maxPassengers;

    public Bus(String typeName, double maxSpeed, int maxPassengers) {
        super(typeName, maxSpeed);
        this.maxPassengers = maxPassengers;
        this.passengers = 0;
        this.speedChange = 0.7;
        this.fuelConsumption = 0.8;
    }

    public void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers++;
            System.out.println("Passenger entered. Total passengers: " + passengers);
        } else {
            System.out.println("Bus is full!");
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("Passenger exited. Total passengers: " + passengers);
        } else {
            System.out.println("No passengers to exit.");
        }
    }

    public int getPassengers() {
        return passengers;
    }

    
    public static void main(String[] args) {
        Car myCar = new Car("Volskwagen Polo", 125);
        SportsCar notMySportsCar = new SportsCar("Ferrari", 300);
        Bus bus = new Bus("Volvo", 80, 25);

        myCar.fillTank();
        notMySportsCar.fillTank();
        bus.fillTank();
        
        printCarDetails(notMySportsCar);
        printCarDetails(myCar);

        printCarDetails(bus);

        for (int i = 0; i < 50; i++) {
            notMySportsCar.accelerate();
            myCar.accelerate();
           
        }
        System.out.println();
        printCarDetails(notMySportsCar);
        printCarDetails(myCar);

        bus.passengerEnter();
        bus.passengerExit();
    }
}
