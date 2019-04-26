package ru.mail.sergey_balotnikov.nask20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string for count punctuation marks: ");
        String s = in.nextLine();
        Pattern pM = Pattern.compile("([a-zA-Z]|[а-яА-Я])(?=[ \\.,!\\?]|$)");
        Matcher ma = pM.matcher(s);
        StringBuilder sb = new StringBuilder();
        while(ma.find()){
            sb.append(ma.group());
        }
        System.out.println(sb);

    }
}
