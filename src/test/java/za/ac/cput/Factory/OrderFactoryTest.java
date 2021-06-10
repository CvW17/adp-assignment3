/*
 *  Order.java
 *  Entity for for the Order
 *  Author: Abongile Tshopi (214254151)
 *  Date created: 08-06-2021
 */


package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Order;

import static org.junit.jupiter.api.Assertions.*;


class OrderFactoryTest {

    @Test
    public void createOrder(){
        Order order = OrderFactory.createOrder("C123", "123Cake", "8-June-2021", "11-June-2021", "B527A, Site C", "Not deliverd", 60.00 );
        System.out.println(order);

    }
}