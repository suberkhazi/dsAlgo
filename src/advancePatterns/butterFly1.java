package advancePatterns;

import java.util.Scanner;

public class butterFly1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = scan.nextInt();

        //upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {  //left part
                System.out.print("* ");
            }
            int space = 2*(n-i);    //printing spaces
            for (int j=1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){   //right part
                System.out.print(" *");
            }
            System.out.println();
        }

        //lower half
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){   //left part
                System.out.print("* ");
            }

            int space2 = 2*(n-i);   //printing spaces
            for (int j=1; j<=space2; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){   // right part
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
