package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.List;

public interface iCustomerRepository<T,ID>{
    Customer create(Customer customer);
    Customer read(int id);
    Customer update (Customer customer);
    boolean delete(int id );
    List<Customer>getAll();
}