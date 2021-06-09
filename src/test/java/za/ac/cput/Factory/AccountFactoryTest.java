package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountFactoryTest {

    @Test
    public void createAccount(){
        Account account = AccountFactory.createAccount("2415166161","26D Parkwood Avenue","26/02/2021",
                "21/06/2021");
        System.out.println(account);
    }

}