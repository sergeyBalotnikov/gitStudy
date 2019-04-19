import java.io.Console;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Console cons = System.console();
        System.out.println("Hello, "+cons.readLine());
    }
}
