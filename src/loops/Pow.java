package loops;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {

        System.out.println("Finding power function without using built-in function \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int result = 0;

        for (int i=0; i<b; i++){
            result += a;
        }
        System.out.println(a + "^" + b + "="+ result);
    }
}
