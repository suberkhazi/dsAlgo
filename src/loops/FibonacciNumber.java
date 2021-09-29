package loops;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to find fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a + " ");
        System.out.println(b + " ");

        for (int i=0; i<n-2; i++){
            int c = a+b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
}
