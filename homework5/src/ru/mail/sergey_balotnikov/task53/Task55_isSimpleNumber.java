package ru.mail.sergey_balotnikov.task53;

import java.util.Scanner;

public class Task55_isSimpleNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());//get number
        boolean isSimpleNumber = false;
        for(int i = 2; i < Math.abs(number); i++){
            if(number%i==0){
                isSimpleNumber = true;
                break;
            }
        }
        if(number==1||isSimpleNumber==false){
            System.out.println(number +" is a simple number.");
        } else {
            System.out.println(number +" is not a simple number.");
        }
    }
}
