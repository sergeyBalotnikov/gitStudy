package ru.mail.sergey_balotnikov;

import java.util.Random;

/*
* Данный класс служит для хранения массива продуктов (перечня наименований товаров).
* Имеет метод, возвращающий радномный массив перечня товаров. Для покупателя.
* */
public class Products {
    private static String[] products = {"milk","apple","tea","condoms","bread","oil","cigarettes",
            "sox","water","meet","eggs","ice-cream","coffee","sugar","salt","lemon",
            "chicken","screws","vodka","coca-cola"};
    public static String[] getProducts(){
        int a = new Random().nextInt(products.length);
        String[] purchases = new String[a];
        for(int i = 0; i<a; i++){
            purchases[i] = products[new Random().nextInt(products.length-1)];
        }
        return purchases;
    }
}
