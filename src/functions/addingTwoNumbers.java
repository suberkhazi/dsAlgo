package functions;

import java.util.Scanner;

public class addingTwoNumbers {
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = scan.nextInt();

        int result = add(num1,num2);

        System.out.println(result);
    }
}
