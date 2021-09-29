package typeCasting;

import java.util.Scanner;

public class addtion {
    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Enter the second number : ");
        int b = scan.nextInt();
        int result = a+b;
        System.out.println(result);
    }
}
