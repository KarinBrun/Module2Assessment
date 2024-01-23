/**
 * @author Karin Brun - KarinBrun
 * CIS175 - Spring 2024
 * Jan 22, 2024
 */

package tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import model.Card;

public class TestCardTwo {
    String cardName = "Bank of Express";
    String cardNum = "0867-7265-9267-5375";
    double cardBalance = 40.00;
    Card card;

    @Before
    public void setUp(){
        card = new Card(cardName, cardNum, cardBalance);
    }

    @Test
    public void testDepositMoneyValidAmount() throws Exception {
        double amount = 10.00;
        card.depositMoney(amount);
        assertEquals((cardBalance + amount), card.getCardBalance(), 0.1);
    }

    @Test
    public void testDepositMoneyInvalidAmount() throws Exception {
        double amount = -5.00;
        assertThrows(Exception.class, () -> {
            card.depositMoney(amount);
        });
    }

    @Test
    public void testChargeCardValidAmount() throws Exception {
        double amount = 10.00;
        card.chargeCard(amount);
        assertEquals((cardBalance - amount), card.getCardBalance(), 0.1);
    }

    @Test
    public void testChargeCardInvalidAmount() throws Exception {
        double amountNeg = -5.00;
        double amountLarge = 100.00;
        assertThrows(Exception.class, () -> {
            card.chargeCard(amountNeg);
        });
        assertThrows(Exception.class, () -> {
            card.chargeCard(amountLarge);
        });
    }
}
