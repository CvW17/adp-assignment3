package za.ac.cput.Factory;

import za.ac.cput.Entity.Account;

import java.util.*;

public class AccountFactory {
    public static Account createAccount(String accountBillingAddress, Date accountOpen, Date accountClose)
    {
       int ranNum = (int) Math.random();
       Account acc = new Account.Builder()
               .setCustomerID(ranNum)
               .setAccountBillingAddress(accountBillingAddress)
               .setAccountOpen(accountOpen)
               .setAccountClose(accountClose)
               .build();
               return acc;


    }
}
