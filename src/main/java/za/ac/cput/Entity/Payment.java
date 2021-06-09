/* Payment.java
 Entity for Payment
 Author: Cameron van Wyk (219088470)
 Date: 06 June 2021
*/

package za.ac.cput.Entity;

public class Payment
{
    private int cusomterID;
    private String paymentDate, paymentDetails;
    private double paymentTotal;

    private Payment(Builder builder)
    {
        this.cusomterID = builder.cusomterID;
        this.paymentDate = builder.paymentDate;
        this.paymentDetails = builder.paymentDetails;
        this.paymentTotal = builder.paymentTotal;
    }

    @Override
    public String toString()
    {
        return "Payment{" +
                "cusomterID=" + cusomterID +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", paymentTotal=" + paymentTotal +
                '}';
    }

    public static class Builder
    {
        private int cusomterID;
        private String paymentDate, paymentDetails;
        private double paymentTotal;

        public Builder setCusomterID(int cusomterID)
        {
            this.cusomterID = cusomterID;
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
            this.cusomterID = payment.cusomterID;
            this.paymentDate = payment.paymentDate;
            this.paymentDetails = payment.paymentDetails;
            this.paymentTotal = payment.paymentTotal;

            return this;
        }
    }
}
