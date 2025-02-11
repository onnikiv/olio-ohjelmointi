package task01;

import java.util.ArrayList;

public class Theater implements Runnable {
    
    private final ArrayList<Customer> customers;
    private int TICKETS;
    

    public Theater(int tickets) {
        this.TICKETS = tickets;
        this.customers = new ArrayList<>();
    }

    public synchronized boolean reserveTicket(Customer customer) {
        if (TICKETS > 0) {
            TICKETS = TICKETS - customer.amountOfTicketsToGet();
            customer.updateTicketAmount(customer.amountOfTicketsToGet());
            System.out.println("Customer [" + customer.getCustomerId() + "] reserved: " + customer.getCustomerTicketAmount() + " tickets.                           Tickets left: " + TICKETS);
            return true;
        } else {
            System.out.println("Customer [" + customer.getCustomerId() + "] couldn't reserve " + " tickets.");
            return false;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            Customer customer = new Customer();
            customers.add(customer);
        }

        for (Customer customer : customers) {
            try {customer.join();} catch (InterruptedException e) {}
        }

        for (Customer customer : customers) {
            reserveTicket(customer);
            
        }
        
    }
}
