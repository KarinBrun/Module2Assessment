/**
 * @author Karin Brun - KarinBrun
 * CIS175 - Spring 2024
 * Jan 22, 2024
 */

package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import model.Card;

public class TestCardOne {
    String cardName = "Bank of Express";
    String cardNum = "0867-7265-9267-5375";
    double cardBalance = 40.00;
    Card card = new Card(cardName, cardNum, cardBalance);

    @Test
    public void testName() {assertSame(cardName, card.getCardName());}

    @Test
    public void testNum() {assertSame(cardNum, card.getCardNum());}

    @Test
    public void testBalance() {assertEquals(cardBalance, card.getCardBalance(), 0.1);}
}
