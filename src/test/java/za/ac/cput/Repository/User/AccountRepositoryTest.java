package za.ac.cput.Repository.User;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User.Account;
import za.ac.cput.Entity.User.Payment;
import za.ac.cput.Factory.User.AccountFactory;
import za.ac.cput.Factory.User.PaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryTest {

    private static AccountRepository accountRepository = new AccountRepository();
    private Account acc1 = AccountFactory.createAccount("5 Sherman Oaks" , "02/05/2021",
            "21/07/2022");

    @Test
    void create() {
        Account accCreated = accountRepository.create(acc1);
        assertEquals(acc1.getCustID(), accCreated.getCustID());
        System.out.println("Created: " +  accCreated);

    }
    @Test
    void update() {
        Account accUpdated = new Account.Builder().copy(acc1).setAccountBillingAddress("25 Rylands Drive").build();
        System.out.println("Updated: " + accUpdated);

    }
    @Test
    void read() {
        Account accRead = accountRepository.read(acc1.getCustID());
        System.out.println("Read: " + accRead);
    }


    @Test
    void delete() {
        accountRepository.delete(acc1.getCustID());
        System.out.println("Deleted: " + acc1.getCustID()+ " ");
    }
}