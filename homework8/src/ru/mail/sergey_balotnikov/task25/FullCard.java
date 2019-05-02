package ru.mail.sergey_balotnikov.task25;

public class FullCard extends CreditCard{
    private int monthlyFee;


    FullCard(String bank, int balance, long cardNumber, int monthlyFee) {
        setBank(bank);
        setBalance(balance);
        setCardNumber(cardNumber);
        this.monthlyFee = monthlyFee;
    }
    FullCard(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    public String toString(){
        return super.toString() +" Monthly fee is "+ getMonthlyFee()+".";
    }

}
