package za.ac.cput.Factory;

import za.ac.cput.Entity.Account;

import java.util.*;

public class AccountFactory {
    public static Account createAccount(String custID,String accountBillingAddress, String accountOpen, String accountClose)
    {

       Account acc = new Account.Builder()
               .setCustID(custID)
               .setAccountBillingAddress(accountBillingAddress)
               .setAccountOpen(accountOpen)
               .setAccountClose(accountClose)
               .build();
               return acc;


    }
}
