package ru.mail.sergey_balotnikov.task42;

import java.util.Scanner;

public class Homes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input width of the first house a: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.println("input length  of the first house b: ");
        int b = Integer.parseInt(in.nextLine());
        System.out.println("input width  of the second house c: ");
        int c = Integer.parseInt(in.nextLine());
        System.out.println("input length  of the second house d: ");
        int d = Integer.parseInt(in.nextLine());
        System.out.println("input width  of the grounds e: ");
        int e = Integer.parseInt(in.nextLine());
        System.out.println("input length  of the grounds f: ");
        int f = Integer.parseInt(in.nextLine());
        //boolean isFit= false;

        int temp = 0;
        if (a>b){} else {temp=a; a = b; b = temp;}
        if (c>d){} else {temp=c; c = d; d = temp;}
        if (e>f){} else {temp=e; e = f; f = temp;}

        if(a*b+c*d > e*f){
            System.out.println("not enough space. the houses will not fit on the plot.");
        } else if (e<a || e<c || f<b || f<d){
            System.out.println("too narrow area. the houses will not fit on the plot.");
        } else if (a+c<=e || (a+d<=e && c<=f) || a+d<=f || (b+c<=e && a<=f) || b+c<=f ||
                (b+d<=e && Math.max(a,c)<=f )|| b+d<=f || a+c<=f){
            System.out.println("the houses will fit on the plot.");

        }
    }
}
