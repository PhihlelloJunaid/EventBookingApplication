package za.ac.cput;


import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.createCustomer("10 Dorset street ",711343965);
        {
            System.out.println(customer.toString());
        }
        }
}