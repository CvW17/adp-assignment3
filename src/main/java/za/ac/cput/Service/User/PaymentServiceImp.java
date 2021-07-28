/* Payment.java
 Entity for Payment Service Implementation
 Author: Cameron van Wyk (219088470)
 Date: 28 July 2021
*/

package za.ac.cput.Service.User;

import za.ac.cput.Entity.User.Payment;
import za.ac.cput.Repository.User.PaymentRepository;
import za.ac.cput.Service.IService;

public class PaymentServiceImp implements IService<Payment, String>
{
    private static PaymentServiceImp service = null;
    private PaymentRepository repository;

    public PaymentServiceImp(PaymentRepository repository)
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
