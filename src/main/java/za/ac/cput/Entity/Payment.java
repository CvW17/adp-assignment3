/* Payment.java
 Entity for the Payment
 Author: Cameron van Wyk (219088470)
 Date: 06 June 2021
*/

package za.ac.cput.Entity;

public class Payment
{
    private int custID;
    private String paymentDate, paymentDetails;
    private double paymentTotal;

    private Payment(Builder builder)
    {
        this.custID = builder.custID;
        this.paymentDate = builder.paymentDate;
        this.paymentDetails = builder.paymentDetails;
        this.paymentTotal = builder.paymentTotal;
    }

    @Override
    public String toString()
    {
        return "Payment{" +
                "custID=" + custID +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", paymentTotal=" + paymentTotal +
                '}';
    }

    public static class Builder
    {
        private int custID;
        private String paymentDate, paymentDetails;
        private double paymentTotal;

        public Builder setCustID(int custID)
        {
            this.custID = custID;
            return this;
        }

        public Builder setPaymentDate(String paymentDate)
        {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder setPaymentDetails(String paymentDetails)
        {
            this.paymentDetails = paymentDetails;
            return this;
        }

        public Builder setPaymentTotal(double paymentTotal)
        {
            this.paymentTotal = paymentTotal;
            return this;
        }

        public Payment build()
        {
            return new Payment(this);
        }

        public Builder copy(Payment payment)
        {
            this.custID = payment.custID;
            this.paymentDate = payment.paymentDate;
            this.paymentDetails = payment.paymentDetails;
            this.paymentTotal = payment.paymentTotal;

            return this;
        }
    }
}
