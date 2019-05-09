package ru.mail.sergey_balotnikov.task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RatingsList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Список на какое колличество оценок нужно создать:");
        int listSize = 0;
        while(true){
            try{
                listSize = Integer.parseInt(in.nextLine());
                if(listSize<0){
                    System.out.println("значение не должно быть отрицательным");
                } else {break;}
            } catch (Exception e){
                System.out.println("Значение должно быть целочисленным не отрицательным числом");
                }
        }
        List <Integer> raitings = new ArrayList<>();
        Iterator  iterator = raitings.iterator();

        for (int i = 0; i<listSize; i++){ //заполнил коллекцию
            raitings.add((int)(Math.round(Math.random()*5)));
        }
        System.out.println("Исходный список оценок:"+'\n'+raitings);

        /*for(int i = 0; i<listSize; i++){
            if(raitings.get(i)<3){
                raitings.remove(i);
                listSize--;
                i--;
            }
        }*/
        iterator = raitings.iterator();
        raitings.removeIf(it->it<3);
       /* while (iterator.hasNext()){
            if((Integer)iterator.next()<3){
                iterator.remove();
            }
        }*/
        System.out.println("Список оценок после удаления неудовлетворительных оценок(<3):"+'\n'+raitings);


    }
}
