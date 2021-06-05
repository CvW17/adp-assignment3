package za.ac.cput.Factory;

import za.ac.cput.Entity.Payment;
import za.ac.cput.Util.GenericHelper;

public class PaymentFactory
{
    public static Payment createPayment(String paymentDate, String paymentDetails, double paymentTotal)
    {
        String customerID = GenericHelper.generateID();
        Payment payment = new Payment.Builder().setCustID(Integer.parseInt(customerID))
                .setPaymentDate(paymentDate)
                .setPaymentDetails(paymentDetails)
                .setPaymentTotal(paymentTotal).build();

        return payment;
    }
}
