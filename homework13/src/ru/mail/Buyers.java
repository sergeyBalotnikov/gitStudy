package ru.mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Buyers implements Runnable{
    private Thread thread;
    private String[] shoppingList;
    private String[] products = {"milk","apple","tea","condoms","bread","oil","cigarettes",
            "sox","water","meet","eggs","ice-cream","coffee","sugar","salt","lemon",
            "chicken","screws","vodka","coca-cola"};

    public Buyers(String name){
        thread = new Thread(this);
        thread.setName(name);

        int a = (int)(Math.random()*20);
        shoppingList = new String[a];
        for(int i = 0; i<shoppingList.length; i++){
            shoppingList[i] = products[new Random().nextInt(20)];
        }
    }

    @Override
    public void run() {
        try {
            System.out.println(thread.getName()+" обслуживается");
            Thread.sleep(500);
            for(int i = 0; i<shoppingList.length; i++){
                System.out.print(shoppingList[i]+", ");
            }
            System.out.println();
            System.out.println(thread.getName()+" закончил обслуживание");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
