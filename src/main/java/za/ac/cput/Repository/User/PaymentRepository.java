/* Payment.java
 Entity for Payment Factory
 Author: Cameron van Wyk (219088470)
 Date: 23 July 2021
*/

package za.ac.cput.Repository.User;

import za.ac.cput.Entity.User.Payment;
import za.ac.cput.Repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepository implements IRepository<Payment, String> {
    private Set<Payment> paymentDescription;

    public PaymentRepository()
    {
        this.paymentDescription = new HashSet<>();
    }

    @Override
    public Payment create(Payment payment) {
        return null;
    }

    @Override
    public Payment read(String s) {
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}