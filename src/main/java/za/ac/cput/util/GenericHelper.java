/*
 *  Order.java
 *  Entity for for the Order
 *  Author: Abongile Tshopi (214254151)
 *  Date created: 08-06-2021
 */

package za.ac.cput.util;

import java.util.UUID;

public class GenericHelper {
    public static String generateId(){

        return UUID.randomUUID().toString();
    }
}
