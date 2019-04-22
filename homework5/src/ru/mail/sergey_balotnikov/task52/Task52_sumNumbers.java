package ru.mail.sergey_balotnikov.task52;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task52_sumNumbers {
    public static void main(String[] args) {
        boolean isTrue = true;
        String EnterValue = " ";
        for(;isTrue;){
            System.out.println("Enter numeral, please; or press [Enter] to exit: ");
            Scanner in = new Scanner(System.in);
            EnterValue = in.nextLine();
            int eValue = 0, sum = 0;
            if(!EnterValue.equals("")){
            try{
                eValue = Integer.parseInt(EnterValue);
                int [] arrayEValue = new int[EnterValue.length()];
                for (int i = 0; i < arrayEValue.length; i++) {
                    arrayEValue[i] = eValue % 10;
                    sum += arrayEValue[i];
                    eValue /= 10;
                }
                System.out.println("Sum numbers of numerals = " + sum);
            } catch (Exception ups){

            } finally {
                if (sum == 0){
                    System.out.println("You input wrong value!");
                }
            }
        } else {isTrue = false;}
    }
}}
