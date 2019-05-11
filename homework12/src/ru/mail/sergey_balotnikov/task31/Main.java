package ru.mail.sergey_balotnikov.task31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        //читаем текст из файла
        try(BufferedReader reader = new BufferedReader(new FileReader("numbers.txt")))
        {
            while(reader.ready()){
                text.append(reader.readLine());
                text.append('\n');
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        ArrayList<Double> previous = new ArrayList<>();
        Pattern p = Pattern.compile("-?(\\d)+(\\.(\\d)+)?+");
        Matcher m = p.matcher(text);
        while (m.find()){
            previous.add(Double.parseDouble(m.group()));
        }
        double sum=0;

        System.out.print("File contains the next numbers: ");
        for(Double i:previous){
            sum+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum all of numbers is "+sum);
        TreeSet<Double> finish = new TreeSet<>(previous);
        System.out.println("Numbers without repeats is "+finish);
    }
}
