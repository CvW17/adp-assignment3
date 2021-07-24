package za.ac.cput.Repository;

/*
 *  Name: Tye Walker
 *  Student Number: 218338562
 *  Group: 23
 *
 *  ICustomerRepository
 */

import za.ac.cput.Entity.User.Customer;
import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, String>{
    // Set is used because each customer is unique
    public Set<Customer> getAll();
}