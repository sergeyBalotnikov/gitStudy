package ru.mail.sergey_balotnikov.task25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.FormatFlagsConversionMismatchException;

public abstract class Cards {
    private String bank;
    private int balance;
    private long cardNumber;


    public long getCardNumber() {
        return cardNumber  ;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String toString(){

        return "Card of "+getBank()+"."+" Card number is "+getCardNumber()+"."+
                " Card balance is "+ getBalance()+".";
    }
}
