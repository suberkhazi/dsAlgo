package functions;

import java.util.Scanner;

public class printingName {
    public static void greeting(String name){
        System.out.println("Welcome "+ name);
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.next();
        greeting(name);

    }
}
