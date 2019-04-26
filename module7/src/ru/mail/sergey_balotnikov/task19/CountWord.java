package ru.mail.sergey_balotnikov.task19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string for count punctuation marks: ");
        String s = in.nextLine();
        int sum = 0;
        Pattern pM = Pattern.compile("([a-zA-Z]+)");
        Matcher ma = pM.matcher(s);
        while(ma.find()){
            sum++;
        }
        System.out.println(sum);
    }
}
