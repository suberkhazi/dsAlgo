package functions;

import java.util.Scanner;

public class fibonacci {
    public static void fab(int n){
        int a=0;
        int b=1;
        System.out.print(a + " " + b + " ");
        for (int i=1; i<=n-2; i++){
            int res = a+b;
            System.out.print(res +" ");
            a=b;
            b=res;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        fab(n);
    }
}
