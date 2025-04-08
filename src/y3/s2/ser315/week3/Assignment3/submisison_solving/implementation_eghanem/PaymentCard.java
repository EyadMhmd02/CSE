package y3.s2.ser315.week3.implementation_eghanem; /**
 * PaymentCard class represents a payment card, such as a credit or debit card, that a user in the system can use to purchase or pay for things.
 */

import java.time.LocalDate;

public class PaymentCard {
    public String name;
    public int cardNo;
    public int cvc;
    public LocalDate expiryDate;
}