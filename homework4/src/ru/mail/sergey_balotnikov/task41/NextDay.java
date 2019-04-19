package ru.mail.sergey_balotnikov.task41;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {


        //get the values ​​from the console
        Scanner in = new Scanner (System.in);
        //int i = 0;
        int dayNom = 0;
        int monthNom = 0;
        int yearNom = 0;
        //int enotherDay = 0;
        int [] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Input day:");
        dayNom = Integer.parseInt(in.nextLine());
        System.out.println("Input month:");
        monthNom = Integer.parseInt(in.nextLine());
        System.out.println("Input year:");
        yearNom = Integer.parseInt(in.nextLine());
        /*public void leapYear(int year){

        }
        //boolean isLeapYear = false;*/
        if((yearNom%4==0&&yearNom%100!=0)||yearNom%400==0)
        {
            monthArray[1] = 29;
        } else {}

        if(dayNom+1 <= monthArray[monthNom-1]){
            dayNom++;
        } else {
            dayNom=1;
            if (monthNom+1 <= monthArray.length){
                monthNom++;
            } else {
                monthNom=1;
                yearNom++;
            }

        }
        System.out.println(dayNom +" "+ monthNom+" " +yearNom);

        /*for(int i = 0; i<monthArray.length;i++){

            sum+=monthArray[i];
            System.out.println(sum);
        }*/
        /*System.out.println("How many days you want add to date:");
        enotherDay = Integer.parseInt(in.nextLine());

        for(;;){
            if(dayNom+enotherDay < monthArray[monthNom-1]){
                dayNom+=enotherDay;
                break;
            } else if (dayNom+enotherDay > monthArray[monthNom-1]){
                dayNom+=enotherDay-monthArray[monthNom-1];
                if (monthNom == monthArray.length){
                    monthNom=1;
                    yearNom++;

                    }
            }
        }*/

        //add days to date
        //dayNom+=enotherDay;
        //check whether the next month has come


    }
}

