package functions;

import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        int fact = 1;
        if(n==0 || n==1){
            System.out.println("1");
        } else if(n<0){
            System.out.println("cant be negative number");
        } else {
            for (int i=n; i>1; i--){
                fact *= i;
            }System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int n = scan.nextInt();
        fact(n);
    }
}
