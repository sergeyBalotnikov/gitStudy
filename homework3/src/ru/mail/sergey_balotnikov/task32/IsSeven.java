package ru.mail.sergey_balotnikov.task32;

import java.util.Scanner;

public class IsSeven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);//
        int i=0;
        while(true){try {
            System.out.print("Введите число, требующие спроверки последней цифры: ");
            i = Integer.parseInt(reader.nextLine());//сохраняем введенное число в переменную`
            break;
        } catch (Exception e){
            System.out.println("You enter not a numeric");
        }}
        if(Math.abs(i)%10==7){//берем остаток от деления на 10, что и есть последняя цифра целого числа
            System.out.println("Введенное число оканчивается на 7: "+ i);
        } else {System.out.println("Введенное число не оканчивается на 7: "+ i);}

    }
}
