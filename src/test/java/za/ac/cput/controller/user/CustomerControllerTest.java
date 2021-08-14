package za.ac.cput.controller.user;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Entity.User.Customer;
import za.ac.cput.Factory.User.CustomerFactory;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerControllerTest {
    private static Customer customer = CustomerFactory.build("John", "Doe", "0821234567", "johndoe@gmail.com");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/customer";

    @Order(1)
    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Customer> postResponse = restTemplate.postForEntity(url, customer, Customer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        customer = postResponse.getBody();
        System.out.println("Customer Saved: " + customer);
        assertEquals(customer.getCustID(), postResponse.getBody().getCustID());
    }

    @Order(2)
    @Test
    void read() {
        String url = baseURL + "/read" + customer.getCustID();
        ResponseEntity<Customer> response = restTemplate.getForEntity(url, Customer.class);
        assertEquals(customer.getCustID(), Objects.requireNonNull(response.getBody()).getCustID());
    }

    @Order(3)
    @Test
    void update() {
        Customer customerUpdated = new Customer.Builder().copy(customer).custLastName("Dig").builder();
        String url = baseURL + "/update";
        ResponseEntity<Customer> response = restTemplate.postForEntity(url, customerUpdated, Customer.class);
        assertNotNull(response.getBody());
    }

    @Order(4)
    @Test
    void delete() {
        String url = baseURL + "/delete/" + customer.getCustID();
        restTemplate.delete(url);
    }
}