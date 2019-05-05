package ru.mail.sergey_balotnikov.task31;

public class DateTime {
    public static void main(String[] args) {

        int s = 3700000;

        int sec;

        int m;

        int min, h, hours, d, days, w;

        sec = s % 60;//sec

        m = (s -sec) / 60;//min

        min = m % 60;//min in hour

        h = (m -min) / 60;//hours

        hours = h % 24;//hours in day

        d = (h - hours) / 24; //days

        days = d % 7;//days in week

        w = (d - days) / 7;//weeks

        System.out.println(w+" недель "+days+" дней "+hours+" часов " + min + " минут " + sec + " секунд.");

    }
}
