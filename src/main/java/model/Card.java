/**
 * @author Karin Brun - KarinBrun
 * CIS175 - Spring 2024
 * Jan 22, 2024
 */

package model;

public class Card {
    private String cardName;
    private String cardNum;
    private double cardBalance;

    public Card() {
    }

    public Card(String cardName, String cardNum, double cardBalance) {
        this.cardName = cardName;
        this.cardNum = cardNum;
        this.cardBalance = cardBalance;
    }


    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void depositMoney(double depositAmount) throws Exception {
        if (depositAmount > 0) {
            this.cardBalance += depositAmount;
        } else {
            throw new Exception("Deposit amount must be positive.");
        }
    }

    public void chargeCard(double chargeAmount) throws Exception {
        if (chargeAmount < 0) {
            throw new Exception("Charge amount must be greater than 0.");
        } else if (chargeAmount > this.cardBalance) {
            throw new Exception("Charge amount exceeds current balance.");
        } else {
            this.cardBalance -= chargeAmount;
        }
    }

}
