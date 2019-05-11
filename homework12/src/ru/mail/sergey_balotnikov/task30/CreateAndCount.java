package ru.mail.sergey_balotnikov.task30;

import java.io.*;

public class CreateAndCount {
    //method for create and overwrite file by date
    public void writeToFile(String string, String name){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(name))){
            writer.write(string);
            writer.write('\n');
            writer.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    //method for create and adding date to file if file exists
    public void appendToFile(String string, String name){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(name, true))){
            writer.write(string);
            writer.write('\n');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //this method return stringBuilder with date from file
    public StringBuilder readFromFile(String name){
        try(BufferedReader reader = new BufferedReader(new FileReader(name))){
            StringBuilder builder = new StringBuilder();
            while(reader.ready()){
            builder.append(reader.readLine());}
            return builder;
        } catch (Exception e){
            System.out.println("File not found");;
            return null;
        }
    }
}
