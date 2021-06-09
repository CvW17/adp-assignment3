package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    String email = "tyewalker09@gmail.com";
    String fakeEmail = "tye`walker09@gmail.com";

    //Test for CustomerFactory.build
    //This will fail if any fields are left bank and if the email is valid.
    @Test
    void validTest() {
        Customer c = CustomerFactory.build("Tye","Walker","0827482442","218338562@mycput.ac.za");
        System.out.println(c);
        assertNotNull(c);
    }

}