package za.ac.cput.Service.User;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User.Payment;
import za.ac.cput.Factory.User.PaymentFactory;
import za.ac.cput.Repository.User.PaymentRepository;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceImpTest
{
    private static PaymentRepository repository = new PaymentRepository();
    private static Payment payment = PaymentFactory.createPayment("2021/06/02" , "Payment", 1000);

    @Test
    void create()
    {
        Payment created = repository.create(payment);
        Assert.assertEquals(payment.getCustomerID(), created.getCustomerID());
        System.out.println("Created: " + created);

    }

    @Test
    void read()
    {
        Payment read = repository.read(payment.getCustomerID());
        System.out.println("Read: " + read);
    }

    @Test
    void update()
    {
        Payment updated = new Payment.Builder().copy(payment).setPaymentTotal(145).build();
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete()
    {
        repository.delete(payment.getCustomerID());
        System.out.println("Deleted: " + payment.getCustomerID() + " ");
    }
}