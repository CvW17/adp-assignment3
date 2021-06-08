package za.ac.cput.Entity;

/*
 *  Name: Tye Walker
 *  Student Number: 218338562
 *  Group: 23
 *
 *  POJO for Customer entity
 */

public class Customer {
    private String custID;
    private String custFirstName, custLastName, custContact, custEmail;

    private Customer(Builder builder) {
        this.custID = builder.custID;
        this.custFirstName = builder.custFirstName;
        this.custLastName = builder.custLastName;
        this.custContact = builder.custContact;
        this.custEmail = builder.custEmail;

    }

    //Inner class
    public static class Builder {
        private String custID;
        private String custFirstName, custLastName, custContact, custEmail;


        public Builder custID(String custID) {
            this.custID = custID;
            return this;
        }

        public Builder custFirstName(String custFirstName) {
            this.custFirstName = custFirstName;
            return this;
        }

        public Builder custLastName(String custLastName) {
            this.custLastName = custLastName;
            return this;
        }

        public Builder custContact(String custContact) {
            this.custContact = custContact;
            return this;
        }

        public Builder custEmail(String custEmail) {
            this.custEmail = custEmail;
            return this;
        }

        public Customer builder() {
            return new Customer(this);

        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custFirstName='" + custFirstName + '\'' +
                ", custLastName='" + custLastName + '\'' +
                ", custContact='" + custContact + '\'' +
                ", custEmail='" + custEmail + '\'' +
                '}';
    }

}
