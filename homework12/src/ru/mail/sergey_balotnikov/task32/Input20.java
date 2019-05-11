package ru.mail.sergey_balotnikov.task32;


import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Input20 {
    public static void main(String[] args) {

        try{
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("numbers.txt")));
                for(int i = 0; i<20; i++){
                    dos.writeDouble(Math.random()*20);
                }
                dos.flush();
                dos.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException ex){
            System.out.println("some exception");
        }
        ArrayList<Double> numbers = new ArrayList<>();
        try{
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(new FileInputStream("numbers.txt")));

            while (true){
                try{
                    numbers.add(dis.readDouble());
                } catch (IOException e){

                    break;
                }
            }

        } catch (FileNotFoundException e ){
            System.out.println("File not found");
        }
        double sum = 0;
        for (int i = 0; i<numbers.size(); i++){
            System.out.println(new DecimalFormat("#0.00").format(numbers.get(i)));
            sum+=numbers.get(i);
        }
        System.out.println("Average of numbers is "+new DecimalFormat("#0.00").format(sum/numbers.size()));
    }
}
