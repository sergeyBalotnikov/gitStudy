package ru.mail.sergey_balotnikov.task41;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TryNexdDay2 {
    //this programm add to entered date input number days.
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("how many days you want to add to the date: ");
        int days = Integer.parseInt(in.nextLine());

        int day;;
        int month;
        int year;
        while (true){
            try {
                System.out.println("Input year:");
                year = Integer.parseInt(in.nextLine());
                if(year>0){break;} else {
                    System.out.println("value should be positive");
                }
            }catch(Exception e){
                System.out.println("value should be numeric");
            }}
        while(true){
            try{
                System.out.println("Input month:");
                month = Integer.parseInt(in.nextLine());
                if(month <= 0 || month>12){
                    System.out.println("value should be positive, from 1 to 12");
                } else {break;}
            } catch (Exception e){
                System.out.println("value should be numeric");

            }}
        while (true) {
            try {
                System.out.println("Input day:");
                day = Integer.parseInt(in.nextLine());
                if (day>29 && ((year%4==0&&year%100!=0) || year%400==0) && month==2){
                    System.out.println("This month has not this day.");
                } else if(day>28 && !((year%4==0&&year%100!=0) || year%400==0) && month==2){
                    System.out.println("This month has not this day.");
                } else if(day>30&&(month==4 || month==6 || month==9 || month==11)){
                    System.out.println("This month has not this day.");
                } else if(day>31){
                    System.out.println("no one months has not this day.");
                } else if (day<=0){
                    System.out.println("value should be positive and not zero");
                } else {break;}
            } catch (Exception e){
                System.out.println("value should be numeric");
            }
        }
        GregorianCalendar date = new GregorianCalendar();
        date.set(year,month,day);

        System.out.println(date.get(Calendar.DAY_OF_MONTH)+" "+date.get(Calendar.MONTH)+" "+date.get(Calendar.YEAR));
        date.add(Calendar.DATE, days);
        System.out.println(date.get(Calendar.DAY_OF_MONTH)+" "+date.get(Calendar.MONTH)+" "+date.get(Calendar.YEAR));
        int [] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int plusYear = 0;
        if(days%365==0&&days/365!=1){}else{plusYear = days/365;}
        int leapDays = plusYear/4 - plusYear/100 + plusYear/400;
        if(days%365==0){}else{
        days = days%365-leapDays;}
        if (days>0){} else {plusYear--; days+=365;}
        year+=plusYear;

        for (;;){
            if((year%4==0&&year%100!=0)||year%400==0)
            {
                dayInMonth[1] = 29;
            } else {}
            if(day+days > dayInMonth[month-1]){
                days-=dayInMonth[month-1];
                month++;
                if (month>12){
                    year++;
                    month = 1;
                } else {}

            } else {
                day+=days;
                break;
            }

        }
        System.out.println( day +" "+ month +" "+ year);

    }
}
