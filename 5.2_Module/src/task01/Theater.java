package task01;

public class Theater {

    
    private int TICKETS;

    public Theater(int tickets) {
        this.TICKETS = tickets;
    }

    public synchronized boolean reserveTicket(Customer customer) {
        if (TICKETS >= customer.amountOfTicketsToGet()) {
            TICKETS = TICKETS - customer.amountOfTicketsToGet();
            customer.updateTicketAmount(customer.amountOfTicketsToGet());
            System.out.println("Customer [" + customer.getCustomerId() + "] has reserved: " + customer.getCustomerTicketAmount() + " tickets.                       Tickets left: " + TICKETS);
            return true;
        } else {
            System.out.println("Customer [" + customer.getCustomerId() + "] couldn't reserve " + customer.amountOfTicketsToGet() + " tickets.                   Tickets left: " + TICKETS);
            return false;
        }
    }
}