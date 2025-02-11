package task01;

public class Customer extends Thread{

    private int ticketsReserved;
    private final int customerId;
    private static int customerAmount = 0;

    public Customer() {
        this.customerId = (customerAmount + 1);
        customerAmount++;
        this.ticketsReserved = 0;
    }

    public int getTotalAmountOfCustomers() {
        return customerAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void reserveTicket(int ticket) {
        ticketsReserved += ticket;
    }

    public int getCustomerTicketAmount() {
        return ticketsReserved;
    }

    public void printInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Tickets: " + ticketsReserved);
    }
}
