package ru.mail.sergey_balotnikov.task41;

import java.util.Scanner;

public class TryNexdDay2 {
    //this programm add to entered date input number days.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many days you want to add to the date: ");
        int days = Integer.parseInt(in.nextLine());
        System.out.println("Enter start day: ");
        int day = Integer.parseInt(in.nextLine());
        System.out.println("Enter start month: ");
        int month = Integer.parseInt(in.nextLine());
        System.out.println("Enter start year: ");
        int year = Integer.parseInt(in.nextLine());
        int [] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int plusYear = days/365;
        int leapDays = plusYear/4 - plusYear/100 + plusYear/400;
        days = days%365-leapDays;
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
