package ru.mail.sergey_balotnikov.task16;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length: ");
        System.out.println();
        int length = Integer.parseInt(in.nextLine());
        int [] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < (array.length)/2; i++){
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
