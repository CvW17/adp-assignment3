/* Payment.java
 Entity for Payment Factory test
 Author: Cameron van Wyk (219088470)
 Date: 09 June 2021
*/

package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User.Payment;

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