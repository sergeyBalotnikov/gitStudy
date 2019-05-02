package ru.mail.sergey_balotnikov.task25;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        card1.setBank("VTB-bank");
        card1.setBalance(25);
        card1.setCardNumber(1547_8612_5798_4654L);
        System.out.println(card1);
        CreditCard card2 = new CreditCard("BPS-bank", 10000, 2457_3214_5000_1000L);

        FullCard card3 = new FullCard(45);
        card3.setBalance(200_000);
        card3.setBank("BlaBlaBlaBank");
        card3.setCardNumber(2154_1512_4457_0000L);
        FullCard card4 = new FullCard("Babank", 500000, 1515_1616_1717_1818L, 70);

        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);


    }
}
