package ru.mail;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cashboxes {
    public static void main(String[] args) {
//кассы пользуются коллекцией товаров,
        ExecutorService workCashboxes = Executors.newFixedThreadPool(3);
        workCashboxes.execute(new Buyers("buyer 2"));
        workCashboxes.execute(new Buyers("buyer 1"));
        workCashboxes.execute(new Buyers("buyer 3"));
        workCashboxes.execute(new Buyers("buyer 4"));
        workCashboxes.execute(new Buyers("buyer 5"));
        workCashboxes.execute(new Buyers("buyer 6"));
        workCashboxes.execute(new Buyers("buyer 7"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));
        workCashboxes.execute(new Buyers("buyer 8"));

    }
}
