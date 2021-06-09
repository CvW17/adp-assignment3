package za.ac.cput.Factory;

/* SupplierFactory.java
Factory for Supplier
Author: Robyn White  (218034555)
Date: 09 June 2021
 */


import za.ac.cput.Entity.Supplier;

import java.util.UUID;

public class SupplierFactory {


    public static Supplier build(String supplierName, String supplierEmail, String supplierPhone) {

        String supplierID = UUID.randomUUID().toString();
        String productID = UUID.randomUUID().toString();
        if (supplierName.isEmpty() || supplierPhone.isEmpty() || supplierPhone.isEmpty())
            return null;

        return new Supplier.Builder()
                .setSupplierID(supplierID)
                .setProductID(productID)
                .setSupplierName(supplierName)
                .setSupplierEmail(supplierEmail)
                .setSupplierPhone(supplierPhone)
                .build();
    }
}
