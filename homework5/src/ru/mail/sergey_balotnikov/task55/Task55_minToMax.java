package ru.mail.sergey_balotnikov.task55;

import java.util.Scanner;

public class Task55_minToMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press array length: ");
        int length = Integer.parseInt(in.nextLine());
        int [] array = new int[length];
        int min = 0, max = 0, sum = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
            if(array[min]>array[i]){
                min=i;
            }
            if(array[max]<array[i]){
                max=i;
            }
        }

        System.out.println();
        System.out.println(array[min] + " is min of array");
        System.out.println(array[max]+" is max of array");

        if(min>max){
            int temp = min;
            min = max;
            max = temp;
        } else{}
        for(int i = min+1; i < max; i++){
            sum+=array[i];
        }
        System.out.println("Sum min to max is " + sum);
    }
}
