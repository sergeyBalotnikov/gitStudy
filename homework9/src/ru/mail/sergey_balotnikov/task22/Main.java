package ru.mail.sergey_balotnikov.task22;

public class Main {
    public static void main(String[] args) {
        TimeInterval t1 = new TimeInterval(85000);
        TimeInterval t2 = new TimeInterval(15,20,6);
        TimeInterval t3 = new TimeInterval(40,36,23);

        System.out.println(t2.getSec());
//        System.out.println(t1.getSec()+" "+t1.getMin()+" "+t1.getHours());
        System.out.println(t2.compareTimeInterval(t1));
        System.out.println(t1.compareTimeInterval(t3));
        System.out.println(t2.getIntervalInSec());
        System.out.println(t1);


    }
}
