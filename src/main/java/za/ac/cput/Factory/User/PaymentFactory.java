/* Payment.java
 Entity for Payment Factory
 Author: Cameron van Wyk (219088470)
 Date: 09 June 2021
*/

package za.ac.cput.Factory.User;

import za.ac.cput.Entity.User.Payment;

public class PaymentFactory
{
    public static Payment createPayment(String customerID, String paymentDate, String paymentDetails, double paymentTotal)
    {
        Payment payment = new Payment.Builder().setCusomterID(customerID)
                .setPaymentDate(paymentDate)
                .setPaymentDetails(paymentDetails)
                .setPaymentTotal(paymentTotal).build();

        return payment;
    }
}