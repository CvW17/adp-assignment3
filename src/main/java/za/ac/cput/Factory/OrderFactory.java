/*
 *  Order.java
 *  Entity for for the Order
 *  Author: Abongile Tshopi (214254151)
 *  Date created: 10-06-2021
 */


package za.ac.cput.Factory;

import za.ac.cput.Entity.Order;
import za.ac.cput.util.GenericHelper;

public class OrderFactory {

    public static Order createOrder(String custID,  String productID, String orderDate, String orderShippedDate, String orderAddress, String orderStatus, double orderTotal ){

        String orderId = GenericHelper.generateId();
        Order order = new Order.Builder()

                .setOrderID(orderId)
                .setCustID(custID)
                .setProductID(productID)
                .setOrderDate(orderDate)
                .setOrderAddress(orderAddress)
                .setOrderShippedDate(orderShippedDate)
                .setOrderTotal(orderTotal)
                .setOrderStatus(orderStatus)
                .build();

        return order;
    }
}
