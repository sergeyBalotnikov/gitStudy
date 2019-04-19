package ru.mail.sergey_balotnikov.task43;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nomFactorial = 0;

        boolean correctNom = false;
        for (;correctNom==false;){
            System.out.println("whith  number factorial do you want to calculate:");
            try {nomFactorial = Integer.parseInt(in.nextLine());
                correctNom = true;
            } catch (NumberFormatException e){

            } finally {
            System.out.println("You enter not a number. Try again.");

            }
        }
        int factorial = 1;
        for (int i = 1; i<=nomFactorial;i++){
            factorial*=i;
        }
        System.out.println("factorial of "+nomFactorial+" = " +factorial);
    }
}
