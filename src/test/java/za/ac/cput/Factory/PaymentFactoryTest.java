package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest
{
    @Test
    public void createPayment()
    {
        Payment payment = PaymentFactory.createPayment("2021/06/02"
                , "Payment", 1000);
        System.out.println(payment);
    }
}