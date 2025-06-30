package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerRepositoryTest {
    private iCustomerRepository repository = CustomerRepository.getRepository();
    private Customer customer = CustomerFactory.createCustomer("10 Dorset",0711343);

    @Test
    @Order(1)
    void a_create() {
        Customer created  = repository.create(customer);
        assertNotNull(created);
        System.out.println("Created : " + created);
    }
    @Test
    @Order(2)
    void b_read() {
        Customer read = repository.read(customer.);
        assertNotNull(read);
        assertEquals(customer.getContactNumber(),read.getAddress());
        System.out.println("Read : " + read);


    }

    @Test
    @Order(3)
    void c_update() {
        Customer newCustomer =new Customer.Builder().copy(customer).setAddress("").build();
        repository.update(newCustomer);
        assertNotNull(repository.update(newCustomer));
        System.out .println("Updated : " + newCustomer);

    }

    @Test
    @Order(4)
    @Disabled
    void d_delete() {
        boolean success = repository.delete(customer.getContactNumber());
        assertTrue(success);
        System.out.println("Deletes : " + customer.getContactNumber());
    }

    @Test
    void e_getAll() {
        System.out.println("All Customers : " + repository.getAll());
    }
}