package za.ac.cput.Repository;

/*
 *  Name: Tye Walker
 *  Student Number: 218338562
 *  Group: 23
 *
 *  CustomerRepository
 */

import za.ac.cput.Entity.User.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository {
    private static CustomerRepository repository = null;
    private Set<Customer> customerDB;

    private CustomerRepository() {
        customerDB = new HashSet<>();
    }

    public static CustomerRepository getRepository() {
        if (repository == null) {
            repository = new CustomerRepository();
        }
        return repository;
    }

    // Create Customer
    @Override
    public Customer create(Customer customer) {
        boolean created = customerDB.add(customer);
        if (!created) {
            return null;
        }
        return customer;
    }

    // Read Customer
    @Override
    public Customer read(String custID) {
        for (Customer c : customerDB)
            if (c.getCustID().equals(custID)) {
                return c;
            }
        return null;
    }

    // Update Customer
    @Override
    public Customer update(Customer customer) {
        Customer firstCustomer = read(customer.getCustID());
        if (firstCustomer != null) {
            customerDB.remove(firstCustomer);
            customerDB.add(customer);
            return customer;
        }
        return null;
    }

    // Delete Customer
    @Override
    public void delete(String customerID) {
        Customer deleteCustomer = read(customerID);
        if (deleteCustomer == null) {
            System.out.println("Customer is null.");
        }
        customerDB.remove(deleteCustomer);
        System.out.println("Customer removed.");
    }

    public Set<Customer> getAll() {
        return customerDB;
    }
}