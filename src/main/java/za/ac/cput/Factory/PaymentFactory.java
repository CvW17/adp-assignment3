package za.ac.cput.Factory;

import za.ac.cput.Entity.Payment;
import java.util.UUID;

public class PaymentFactory
{
    public static Payment createPayment(String paymentDate, String paymentDetails, double paymentTotal)
    {
        String customerID = UUID.randomUUID().toString();
        Payment payment = new Payment.Builder().setCusomterID(Integer.parseInt(customerID))
                .setPaymentDate(paymentDate)
                .setPaymentDetails(paymentDetails)
                .setPaymentTotal(paymentTotal).build();

        return payment;
    }
}