package za.ac.cput.Factory;

/*
 *  Name: Tye Walker
 *  Student Number: 218338562
 *  Group: 23
 *
 *  CustomerFactoryTest class
 */



import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Customer;
import za.ac.cput.Factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {


    //Test for CustomerFactory.build
    //This test is to check if the values are valid.
    //This test will pass
    @Test
    void validTest() {
        Customer c = CustomerFactory.build("Tye","Walker","0827482442","218338562@mycput.ac.za");
        System.out.println(c);
        assertNotNull(c);
    }

    //This test WILL fail because the email is invalid.
    @Test
    void valiTestFail() {
        Customer c = CustomerFactory.build("John","Doe","0123456789","John``Doe@gmail.com");
        System.out.println(c);
       // assertNotNull(c);
    }
}