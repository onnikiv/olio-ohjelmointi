package task01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Customer> customers = new ArrayList<>();

        Theater teatteri = new Theater(10);

        for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            Customer customer = new Customer(teatteri);
            customers.add(customer);
            
        }

        for (Customer customer : customers) {
            customer.start();

            
        }
        
        for (Customer customer : customers) {
            try {
                // System.out.print(customer.getCustomerId() + " - ");
                customer.join();
            } catch (InterruptedException e) {

            }
            
        }
    }
}
