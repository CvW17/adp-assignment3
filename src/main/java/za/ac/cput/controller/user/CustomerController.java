package za.ac.cput.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.User.Customer;
import za.ac.cput.Factory.User.CustomerFactory;
import za.ac.cput.Services.User.CustomerService;

import java.util.Set;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Create:
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Customer create(@RequestBody Customer customer) {
        Customer newCustomer = CustomerFactory.build(customer.getCustFirstName(), customer.getCustLastName(),
                                                    customer.getCustContact(), customer.getCustEmail());
        return customerService.create(newCustomer);
    }

    // Get All:
    @GetMapping("/getall")
    public Set<Customer> getAll() {
        return customerService.getAll();
    }
}
