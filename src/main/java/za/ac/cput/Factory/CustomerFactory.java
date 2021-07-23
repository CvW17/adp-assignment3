package za.ac.cput.Factory;

import za.ac.cput.Entity.User.Customer;


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
        String regex = "^\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
        return custEmail.matches(regex);
    }

    public static Customer build(String custFirstName, String custLastName, String custContact, String custEmail) {

        //UniqueID for customer
        String custID = UUID.randomUUID().toString();

        //Customer cannot be created if email is invalid.
        if(!validEmail(custEmail)) {
            return null;
        }

        if(custFirstName.isEmpty() || custLastName.isEmpty() || custContact.isEmpty() || custEmail.isEmpty() )
            return null;

        return new Customer.Builder().custID("").custFirstName(custFirstName).custLastName(custLastName).custContact(custContact).custEmail(custEmail).builder();
    }
}
