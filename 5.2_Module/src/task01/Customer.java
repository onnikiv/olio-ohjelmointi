package task01;

public class Customer extends Thread {

    private int ticketsReserved;
    private final int amountOfTicketsToGet;
    private final int customerId;
    private static int customerAmount = 0;

    private final Theater theater;

    public Customer(Theater theater) {
        this.customerId = (customerAmount + 1);
        customerAmount++;
        this.ticketsReserved = 0;
        //System.out.println("Customer " + customerId + " luotu");
        this.amountOfTicketsToGet = 1 + (int) (Math.random() * 4); // 1-4 lippua varattavaksi

        this.theater = theater;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getCustomerTicketAmount() {
        return ticketsReserved;
    }

    public int amountOfTicketsToGet() {
        return amountOfTicketsToGet;
    }

    public void updateTicketAmount(int tickets) {
        this.ticketsReserved = tickets;
    }

    public void printInfo() {
        System.out.println("Customer: " + customerId);
        System.out.println("Tickets: " + ticketsReserved);
    }

    @Override
    public void run() {
        theater.reserveTicket(this);
    }
}
