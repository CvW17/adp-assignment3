package za.ac.cput.Entity;

import java.util.*;

public class Account {
    private int customerID;
    private String accountBillingAddress;
    private Date accountOpen,accountClose;

    private Account(Builder builder){

        this.customerID = builder.customerID;
        this.accountBillingAddress = builder.accountBillingAddress;
        this.accountOpen = builder.accountOpen;
        this.accountClose = builder.accountClose;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerID=" + customerID +
                ", accountBillingAddress='" + accountBillingAddress + '\'' +
                ", accountOpen=" + accountOpen +
                ", accountClose=" + accountClose +
                '}';
    }

    public static class Builder{
        public int customerID;
        public String accountBillingAddress;
        public Date accountOpen, accountClose;

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setAccountBillingAddress(String accountBillingAddress) {
            this.accountBillingAddress = accountBillingAddress;
            return this;
        }

        public Builder setAccountOpen(Date accountOpen) {
            this.accountOpen = accountOpen;
            return this;
        }

        public Builder setAccountClose(Date accountClose) {
            this.accountClose = accountClose;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
        public Account.Builder copy(Account account){
            this.customerID = account.customerID;
            this.accountBillingAddress = account.accountBillingAddress;
            this.accountOpen = account.accountOpen;
            this.accountClose= account.accountClose;
            return this;
        }
    }

}
