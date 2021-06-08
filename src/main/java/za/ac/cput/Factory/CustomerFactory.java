package za.ac.cput.Factory;

import za.ac.cput.Entity.Customer;
import java.util.regex.Pattern;


/*
 *  Name: Tye Walker
 *  Student Number: 218338562
 *  Group: 23
 *
 *  CustomerFactory class
 */

import java.util.UUID;

public class CustomerFactory {


    //Method to validate email address:
    //Uses java.util.regex.Pattern.matches()
    static boolean validEmail(String custEmail) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return custEmail.matches(regex);
    }

    public static Customer build(String custFirstName, String custLastName, String custContact, String custEmail) {

        //UniqueID for customer
        String custID = UUID.randomUUID().toString();

        if(custFirstName.isEmpty() || custLastName.isEmpty() || custContact.isEmpty() || custEmail.isEmpty() )
            return null;

        if(validEmail(custEmail)==false) {
            return null;
        }

        return new Customer.Builder().custID("").custFirstName(custFirstName).custLastName(custLastName).custContact(custContact).custEmail(custEmail).builder();
    }
}
