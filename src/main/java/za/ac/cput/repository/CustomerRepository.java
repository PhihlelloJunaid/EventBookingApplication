package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements iCustomerRepository{
    private static CustomerRepository repository = null;

    private List <Customer> customerList = new ArrayList<>();

    private CustomerRepository(){}

    public static CustomerRepository getRepository(){
        if(repository == null){
            repository = new CustomerRepository();
        }
        return repository;
    }
    @Override
    public Customer create(Customer customer) {
        customerList.add(customer);
        return customer;
    }


    @Override
    public Customer read(int id) {
        customerList.add(customerList.get(id));
        return customerList.get(id);
    }

    @Override
    public Customer update(Customer customer) {
        customerList.set(customerList.indexOf(customer), customer);
        return customer;

    }

    @Override
    public boolean delete(int id) {
        customerList.remove(id);
        return true;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }
}
