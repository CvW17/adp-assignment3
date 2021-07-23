/* ProductFactory.java
Product Factory class created using Factory design pattern
Author: Antin Williams 219212058
Date: 09 June 2021
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Product.Product;

import java.util.UUID;

public class ProductFactory {
    public static Product build(String productName, double productPrice){
        String productID = UUID.randomUUID().toString();
        String supplierID = UUID.randomUUID().toString();
        if(productName.isEmpty() || productPrice < 0.0){
            return null;
        }
        return new Product.Builder().productID(productID).supplierID(supplierID).productName(productName).productPrice(productPrice).build();
    }
}
