/* Payment.java
 Entity for Payment Factory
 Author: Cameron van Wyk (219088470)
 Date: 23 July 2021
*/

package za.ac.cput.Repository.User;

import za.ac.cput.Entity.User.Payment;
import za.ac.cput.Factory.PaymentFactory;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepository
{

    public PaymentRepository()
    {

    }

    public Payment create(String customerID, String paymentDate, String paymentDetails, double paymentTotal)
    {
        return null;
    }

    public Payment read(String customerID)
    {
        return null;
    }

    public Payment update(Payment payment)
    {
        return null;
    }

    public void delete(String customerID, String paymentDate, String paymentDetails, double paymentTotal)
    {

    }
}
