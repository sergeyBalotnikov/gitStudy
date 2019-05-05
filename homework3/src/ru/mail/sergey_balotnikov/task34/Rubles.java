package ru.mail.sergey_balotnikov.task34;

import java.util.Scanner;

public class Rubles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rub=0;
        while (true){
            try{System.out.println("enter the amount of rubles: ");
            rub = Integer.parseInt(in.nextLine());
            if(rub<0){
                System.out.println("value must be positive");
            } else {break;}
            } catch (Exception e){
                System.out.println("Your enter not a numeric");
            }
        }
        int rub2 = rub%10;
        String s = "";
        if(rub2 == 1){
            s = "рубль";
        } else if (rub2==2||rub2==3||rub2==4){
            s = "рубля";
        } else {
            s = "рублей";
        }
        System.out.println("У Вас "+rub+" "+s);
    }
}
