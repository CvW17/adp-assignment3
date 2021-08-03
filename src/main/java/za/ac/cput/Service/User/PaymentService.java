/* Payment.java
 Entity for Payment Service
 Author: Cameron van Wyk (219088470)
 Date: 28 July 2021
*/

package za.ac.cput.Service.User;

import za.ac.cput.Entity.User.Payment;
import za.ac.cput.Repository.User.PaymentRepository;
import za.ac.cput.Service.IService;

public class PaymentService implements IService<Payment, String>
{
    private static PaymentService service = null;
    private PaymentRepository repository;

    public PaymentService(PaymentRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public Payment create(Payment payment)
    {
        return this.repository.create(payment);
    }

    @Override
    public Payment read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public Payment update(Payment payment)
    {
        return this.repository.update(payment);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
