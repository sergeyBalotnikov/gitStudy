package ru.mail.sergey_balotnikov.task42;

import java.util.Scanner;

public class Homes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A;
        int a,b,c,d,e,f;
        //получение значений с консоли с проверкой
        while(true){
            try{
                System.out.println("input width of the first house a: ");
                A = in.nextLine();
                a = Integer.parseInt(A);
                if(a>0){break;} else {
                    System.out.println("значением должно быть положительное число.");
                }
            } catch (Exception ups){
                System.out.println("you enter wrong number");
            }
        }
        while(true){
            try{
                System.out.println("input width of the first house b: ");
                A = in.nextLine();
                b = Integer.parseInt(A);
                if(b>0){break;} else {
                    System.out.println("значением должно быть положительное число.");
                }
            } catch (Exception ups){
                System.out.println("you enter wrong number");
            }
        }
        while(true){
            try{
                System.out.println("input width of the first house c: ");
                A = in.nextLine();
                c = Integer.parseInt(A);
                if(c>0){break;} else {
                    System.out.println("значением должно быть положительное число.");
                }
            } catch (Exception ups){
                System.out.println("you enter wrong number");
            }
        }
        while(true){
            try{
                System.out.println("input width of the first house d: ");
                A = in.nextLine();
                d =Integer.parseInt(A);
                if(d>0){break;} else {
                    System.out.println("значением должно быть положительное число.");
                }
            } catch (Exception ups){
                System.out.println("you enter wrong number");
            }
        }
        while(true){
            try{
                System.out.println("input width of the first house e: ");
                A = in.nextLine();
                e = Integer.parseInt(A);
                if(e>0){break;} else {
                    System.out.println("значением должно быть положительное число.");
                }
            } catch (Exception ups){
                System.out.println("you enter wrong number");
            }
        }
        while(true){
            try{
                System.out.println("input width of the first house f: ");
                A = in.nextLine();
                f = Integer.parseInt(A);
                if(f>0){break;} else {
                    System.out.println("значением должно быть положительное число.");
                }
            } catch (Exception ups){
                System.out.println("you enter wrong number");
            }
        }


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
