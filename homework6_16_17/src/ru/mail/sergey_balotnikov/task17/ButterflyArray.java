package ru.mail.sergey_balotnikov.task17;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ButterflyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input \"butterfly\" size: ");
        int size = Integer.parseInt(in.nextLine());
        int [][] butterfly = new int [size][size];
        for(int i = 0; i<butterfly.length; i++){
        for(int j = 0; j<butterfly[0].length; j++) {
            if (i <= (butterfly.length-1) / 2) {
                if (j >= i && j < butterfly.length - i) {
                    butterfly[i][j] = 1;
                } else {
                    butterfly[i][j] = 0;
                }
            } else if (j <= i && j >= butterfly.length-1 - i) {
                butterfly[i][j] = 1;
            } else {
                butterfly[i][j] = 0;
            }
            System.out.print(butterfly[i][j] + "\t");
        }
            System.out.println();
        }
    }

}