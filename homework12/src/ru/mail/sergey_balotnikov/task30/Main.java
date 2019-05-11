package ru.mail.sergey_balotnikov.task30;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input file name:");//get file name from console
        String fileName = in.nextLine();
        String date = "";
        CreateAndCount createAndCount = new CreateAndCount();
        boolean repeat = true;
        while(repeat) {//get command from console
            System.out.println("For count words and punctuation marks press [c]"+
                    '\n'+ "For add date press [+]"+
                    '\n'+"Overwrite this file press[-]"+
                    '\n'+"Input new file name press[n]"+
                    '\n'+"For close press [Enter] ");
            String command = in.nextLine();
            switch (command){
                case "+"://command for adding date to file (fileName), with creating file if it exists
                    System.out.println("Input text:");
                    date = in.nextLine();//get date (String) for adding from console
                    createAndCount.appendToFile(date,fileName);
                    break;
                case "-"://command for create file if it exists and adding date, or overWriting file by new date
                    System.out.println("Input text:");
                    date = in.nextLine();//get date (String) for overWriting from console
                    createAndCount.writeToFile(date, fileName);
                    break;
                case ""://command for finish program
                    repeat = !repeat;
                    break;
                case "c"://command for count words ana punctuation marks
                    int cow = 0, copm = 0;
                    File file = new File(fileName);//check existing of file
                    if(!file.exists()){//break is file not exists
                        System.out.println('\n'+"File not exist. First create the file by adding date " +
                                "or input new file name"+'\n'); break;}
                    Pattern pw = Pattern.compile("([а-яА-Я]+|[a-zA-Z]+)");//pattern for words
                    Pattern ppm = Pattern.compile("[\\.,!\\?:;-]");//...for punctuation marks
                    Matcher mw = pw.matcher(createAndCount.readFromFile(fileName));
                    Matcher mpm = ppm.matcher(createAndCount.readFromFile(fileName));
                    while (mw.find())   {   cow++;  }
                    while (mpm.find())  {   copm++;  }
                    System.out.println('\n'+"Text of file "+fileName+":");
                    System.out.println(createAndCount.readFromFile(fileName));
                    System.out.println('\n'+"Sum of words is "+cow+'\n'+"Sum of punctuation marks is "+copm+'\n');
                    break;
                case "n":
                    System.out.println("Input new file name: ");
                    fileName = in.nextLine();
                    break;
                default:
                    System.out.println("Your command is wrong. Repeat input command.");
            }

        }

    }
}
