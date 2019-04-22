package ru.mail.sergey_balotnikov.task54;

import java.util.Scanner;

public class Task54_AccountingFormat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        String Number = in.nextLine();
        int number = Integer.parseInt(Number);
        int [] accountingFormat = new int[Number.length()];
        for (int i = accountingFormat.length-1; i >=0; i--){
            accountingFormat[i] = number%10;
            number/=10;
        }
        for (int i = 0; i<accountingFormat.length;i++){
        if((accountingFormat.length-i)%3==0&&i!=0)System.out.print(" ");
        System.out.print(accountingFormat[i]);
        }

    }
}
