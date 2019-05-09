package ru.mail.sergey_balotnikov.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ratings {
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
        List<Integer> raitingsList = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<listSize; i++){
            raitingsList.add((int)(Math.random()*100));
        }
        System.out.println("Список оценок:"+'\n'+raitingsList);
        Iterator it = raitingsList.iterator();
        while(it.hasNext()){

                int temp = (Integer)it.next();
                if(temp>max)
                max = temp;

        }
        System.out.println("Максимальная оценка = "+max);
    }
}
