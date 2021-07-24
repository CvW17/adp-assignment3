package za.ac.cput.Repository;

/*
 *  Name: Tye Walker
 *  Student Number: 218338562
 *  Group: 23
 *
 *  Tests for CustomerRepository
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.User.Customer;
import za.ac.cput.Factory.User.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerRepositoryTest {
    private static CustomerRepository repository = CustomerRepository.getRepository();
    private static Customer customer = CustomerFactory.build("Jane", "Doe", "555819643", "johndoe554@yahoo.com");

    // Test to create Customer:
    @Order(1)
    @Test
    void createTest() {
        Customer created = repository.create(customer);
        assertEquals(created.getCustID(), customer.getCustID());
        System.out.println("Created: " + created);
    }

    // Test to read Customer:
    @Order(2)
    @Test
    void readTest() {
        Customer read = repository.read(customer.getCustID());
        assertEquals(read.getCustID(), customer.getCustID());
        System.out.println("Read: " + read);
    }

    // Test to update Customer:
    @Order(3)
    @Test
    void updateTest() {
        Customer updateCustomer = new Customer.Builder().copy(customer).custFirstName("Jane").custLastName("Turner").custContact("555819643").custEmail("johndoe554@yahoo.com").builder();
        assertNotNull(repository.update(updateCustomer));
        System.out.println("Update: " + updateCustomer);
    }

    // Test to delete Customer:
    @Order(4)
    @Test
    void deleteTest() {
        repository.delete(customer.getCustID());
        assertNotNull(repository);
    }

    // Displays all customer objects.
    @Order(5)
    @Test
    void getAllTest() {
        System.out.println(repository.getAll());
    }
}