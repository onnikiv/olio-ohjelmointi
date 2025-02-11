package task01;


public class Main {

    public static void main(String[] args) {
        
    
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        

        System.out.println(customer1.getTotalAmountOfCustomers());

        System.out.println(customer2.getCustomerId());
        customer2.reserveTicket(6);

        customer1.printInfo();
        customer2.printInfo();

    }

}
