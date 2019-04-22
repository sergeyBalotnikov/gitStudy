package ru.mail.sergey_balotnikov.task51;

import java.util.Scanner;

public class Task51_maxFromArray {
    public static void main(String[] args) {
        boolean isTrue = true;
        String arrayLength = " ";

        while(isTrue){
            Scanner in = new Scanner(System.in);//create scanner
            System.out.println("Input array length:");
            arrayLength = in.nextLine();//add value from console
            int length = 0;
            int max = 0;
            try{ length = Integer.parseInt(arrayLength); //do if value is number
                int [] array = new int[length];
                for(int i = 0; i<array.length; i++){
                    array[i] = (int)(Math.random()*100);
                    System.out.print(array[i]+" ");
                }
                for (int i = 1; i < array.length; i++){
                    if(array[max]<array[i]){
                        max=i;
                    } else {}

                }
                System.out.println("Array max = " + array[max]);

            } catch (Exception ups){

            } finally { //do if value not a number
                if (length == 0){
                System.out.println("You enter wrong value!");
                }
            }// continue or exit
            System.out.println("Press [any button] to input new array or press [enter] to exit:");
            arrayLength = in.nextLine();
            if (arrayLength.equals("")){
                isTrue = false;
                }


        }
    }
}
