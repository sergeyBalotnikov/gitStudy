package ru.mail.sergey_balotnikov.task43;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {//4249290049419214848
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nomFactorial = 0;

        boolean correctNom = false;
        for (;correctNom==false;){
            System.out.println("What number factorial do you want to calculate:");
            try {nomFactorial = Integer.parseInt(in.nextLine());
                correctNom = true;
            } catch (NumberFormatException e){

                System.out.println("You enter not a number. Try again.");
            }
        }
        long factorial = 1;
        for (int i = 1; i<=Math.abs(nomFactorial);i++){
            factorial*=i;
        }
        if(nomFactorial<0 &&nomFactorial%2!=0){
            factorial=-factorial;
        }
        if(nomFactorial==0){factorial=0;}
        System.out.println("factorial of "+nomFactorial+" = " +factorial);
    }
}
