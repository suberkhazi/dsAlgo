package loops;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        System.out.println("Finding the largest of 3 numbers");
        Scanner scan = new Scanner(System.in);
        int a,b,c,result;
        System.out.print("Enter the A : ");
        a = scan.nextInt();
        System.out.print("Enter the B : ");
        b = scan.nextInt();
        System.out.print("Enter the C : ");
        c = scan.nextInt();
        if (a > c) {
            if(a > b){
                result = a;
            }else {
                result = b;
            }
        } else {
            result = c;
        }
        System.out.println("The largest number is " + result);
    }
}
