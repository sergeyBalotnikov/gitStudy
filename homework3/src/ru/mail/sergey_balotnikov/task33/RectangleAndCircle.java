package ru.mail.sergey_balotnikov.task33;

import java.util.Scanner;

public class RectangleAndCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,r;
        while(true){
            try{
                System.out.println("enter length a: ");
                a = Integer.parseInt(in.nextLine());
                if (a<0){
                    System.out.println("you input wrong value");
                } else  {break;}
            }catch (Exception e){
                System.out.println("you input wrong value");

            }
        }
        while(true){
            try{
                System.out.println("enter width b: ");
                b = Integer.parseInt(in.nextLine());
                if (b<0){
                    System.out.println("you input wrong value");
                } else  {break;}
            }catch (Exception e){
                System.out.println("you input wrong value");

            }
        }
        while(true){
            try{
                System.out.println("enter radius r: ");
                r = Integer.parseInt(in.nextLine());
                if (r<0){
                    System.out.println("you input wrong value");
                } else  {break;}
            }catch (Exception e){
                System.out.println("you input wrong value");

            }
        }
        System.out.println("You enter rectangle with size a = "+ a+
                ", b = "+b+"; radius of circle r = "+r);
        if(Math.sqrt(a*a + b*b)<r*2){
            System.out.println("A circle of radius "+r+" can close the hole "+a+'/'+b);

        } else {
            System.out.println("A circle of radius "+r+" can't close the hole "+a+'/'+b);
        }


    }
}
