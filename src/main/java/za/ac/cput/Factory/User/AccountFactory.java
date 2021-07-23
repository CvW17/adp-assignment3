package za.ac.cput.Factory.User;
/* AccountFactory.java
Entity for the Account
Author: Tauriq-Allie Wilkinson  (219071330)
Date: 10 June 2021
 */
import za.ac.cput.Entity.User.Account;

import java.util.UUID;

public class AccountFactory {


    public static Account createAccount(String accountBillingAddress, String accountOpen, String accountClose) {

        String cID = UUID.randomUUID().toString();
        Account acc = new Account.Builder()
                .setCustID(cID)
                .setAccountBillingAddress(accountBillingAddress)
                .setAccountOpen(accountOpen)
                .setAccountClose(accountClose)
                .build();
        return acc;
    }
}
