package za.ac.cput.Factory;

/* AccountFactoryTest.java
Entity for the Account
Author: Tauriq-Allie Wilkinson  (219071330)
Date: 10 June 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Account;


class AccountFactoryTest {
    @Test
    public void createAccount(){

    Account acc = AccountFactory.createAccount("26D Parkwood Avenue",
            "26/02/2021","29/05/2021");

        System.out.println(acc);
}

}