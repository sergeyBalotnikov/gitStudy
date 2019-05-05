package ru.mail.sergey_balotnikov.task41;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        //get the values from the console
        Scanner in = new Scanner (System.in);
        int dayNom = 0;
        int monthNom = 0;
        int yearNom = 0;
        
        int [] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
        //получаем значения с консоли и проверяем их корректность
        while (true){
            try {
            System.out.println("Input year:");
            yearNom = Integer.parseInt(in.nextLine());
            if(yearNom>0){break;} else {
                System.out.println("value should be positive");
            }
            }catch(Exception e){
                System.out.println("value should be numeric");
            }}
        while(true){
            try{
                System.out.println("Input month:");
                monthNom = Integer.parseInt(in.nextLine());
                if(monthNom <= 0 || monthNom>12){
                    System.out.println("value should be positive, from 1 to 12");
                } else {break;}
            } catch (Exception e){
                System.out.println("value should be numeric");

            }}
        while (true) {
            try {
                System.out.println("Input day:");
                dayNom = Integer.parseInt(in.nextLine());
                if (dayNom>29 && ((yearNom%4==0&&yearNom%100!=0) || yearNom%400==0) && monthNom==2){
                    System.out.println("This month has not this day.");
                } else if(dayNom>28 && !((yearNom%4==0&&yearNom%100!=0) || yearNom%400==0) && monthNom==2){
                    System.out.println("This month has not this day.");
                } else if(dayNom>30&&(monthNom==4 || monthNom==6 || monthNom==9 || monthNom==11)){
                    System.out.println("This month has not this day.");
                } else if(dayNom>31){
                    System.out.println("no one months has not this day.");
                } else if (dayNom<=0){
                    System.out.println("value should be positive and not zero");
                } else {break;}
            } catch (Exception e){
                System.out.println("value should be numeric");
            }
        }

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
        System.out.println("next day is :"+dayNom +" "+ monthNom+" " +yearNom);

       }
}

