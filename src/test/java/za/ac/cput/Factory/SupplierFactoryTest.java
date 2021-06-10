package za.ac.cput.Factory;

/* SupplierFactoryTest.java
Factory Test for Supplier
Author: Robyn White  (218034555)
Date: 09 June 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


public class SupplierFactoryTest {

    @Test                                      //Tests to see if all fields have a value and is not null
    void testCorrectData(){
        Supplier s = SupplierFactory.build("CakeHouse","Cakeman@gmail.com","0216549132");
        System.out.println(s);
        assertNotNull(s);
    }

    @Test                                      //Tests to see if all fields are null
    void testIncorrectData(){
        Supplier s = SupplierFactory.build("","","");
        System.out.println(s);
        assertNull(s);
    }
}
