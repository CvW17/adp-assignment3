package za.ac.cput.Entity;
/* Account.java
Entity for the Account
Author: Tauriq-Allie Wilkinson  (219071330)
Date: 9 June 2021
 */
public class Account {

    private String custID, accountBillingAddress,accountOpen,accountClose;


    private Account(Builder builder){

        this.custID = builder.custID;
        this.accountBillingAddress = builder.accountBillingAddress;
        this.accountOpen = builder.accountOpen;
        this.accountClose = builder.accountClose;
    }

    @Override
    public String toString() {
        return "Account{" +
                "custID=" + custID +
                ", accountBillingAddress='" + accountBillingAddress + '\'' +
                ", accountOpen=" + accountOpen +
                ", accountClose=" + accountClose +
                '}';
    }

    public static class Builder{
        public String custID;
        public String accountBillingAddress;
        public String accountOpen;
        public String accountClose;

        public Builder setCustID(String custID) {
            this.custID = custID;
            return this;
        }

        public Builder setAccountBillingAddress(String accountBillingAddress) {
            this.accountBillingAddress = accountBillingAddress;
            return this;
        }

        public Builder setAccountOpen(String accountOpen) {
            this.accountOpen = accountOpen;
            return this;
        }

        public Builder setAccountClose(String accountClose) {
            this.accountClose = accountClose;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
        public Account.Builder copy(Account account){
            this.custID = account.custID;
            this.accountBillingAddress = account.accountBillingAddress;
            this.accountOpen = account.accountOpen;
            this.accountClose= account.accountClose;
            return this;
        }
    }

}
