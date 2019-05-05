package ru.mail.sergey_balotnikov.task54;


import java.util.Scanner;

public class Task54_AccountingFormat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long number;
        String inputValue;
        while(true){
            System.out.println("Enter number: ");
            inputValue = in.nextLine();
            try {
                number = Long.parseLong(inputValue);
                break;
            } catch (Exception e){
                System.out.println("Input wrong value. Try again");
            }
        }

        char [] inputValToChar = inputValue.toCharArray();
        for(int i = 0; i<inputValToChar.length; i++){
            System.out.print(inputValToChar[i]);
            if((inputValToChar.length-i-1)%3 == 0 && inputValToChar[i]!='-' && i!=inputValToChar.length-1){
                System.out.print(" ");
            }
        }
    }

}
