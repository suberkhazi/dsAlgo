package advancePatterns;

import java.util.Scanner;

public class diamondPattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = scan.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
