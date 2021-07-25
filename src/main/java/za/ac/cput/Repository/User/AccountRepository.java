package za.ac.cput.Repository.User;

/* AccountRepository.java
Entity for the Account
Author: Tauriq-Allie Wilkinson  (219071330)
Date: 26 July 2021
 */
import za.ac.cput.Entity.User.Account;
import za.ac.cput.Factory.User.AccountFactory;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public class AccountRepository implements IRepository<Account,String> {


    private Set<Account> accountDB ;

    public AccountRepository()
    {
        this.accountDB = new HashSet<>();
    }


    public Account create(Account account){
        Account acc1 = AccountFactory.createAccount("5 Sherman Oaks" , "02/05/2021",
                "21/07/2022");
        this.accountDB.add(account);
        return account;
    }


    public Account read(String custID)
    {
        Account account = null;
        for(Account a : accountDB)
        {
            if(a.getCustID().equalsIgnoreCase(custID))
            {
                account = a;
                break;
            }
        }
        return account;
    }


    public Account update(Account account){
        Account oldAccount = read(account.getCustID());
        if(oldAccount != null){
            accountDB.remove(oldAccount);
            accountDB.add(account);
        }
        return account;
    }

    public void delete(String custID){
        Account account =read(custID);
        if(custID != null){
            this.accountDB.remove(account);
        }

    }

}
