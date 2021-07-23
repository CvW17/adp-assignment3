/* Payment.java
 Entity for Payment Factory
 Author: Cameron van Wyk (219088470)
 Date: 09 June 2021
*/

package za.ac.cput.Factory;

import za.ac.cput.Entity.User.Payment;
import java.util.UUID;

public class PaymentFactory
{
    public static Payment createPayment(String paymentDate, String paymentDetails, double paymentTotal)
    {
        String customerID = UUID.randomUUID().toString();
        Payment payment = new Payment.Builder().setCusomterID(customerID)
                .setPaymentDate(paymentDate)
                .setPaymentDetails(paymentDetails)
                .setPaymentTotal(paymentTotal).build();

        return payment;
    }
}