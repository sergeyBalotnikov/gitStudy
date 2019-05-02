package ru.mail.sergey_balotnikov.task25;

public class CreditCard extends Cards {
    private int limit;

    public CreditCard(){
    }
    public CreditCard(String bank, int balance, long cardNumber) {
        setBank(bank);
        setBalance(balance);
        setCardNumber(cardNumber);
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit + getBalance();
    }
}
