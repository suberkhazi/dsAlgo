package pattern;

import java.util.Scanner;

public class invertedNumberHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = scan.nextInt();

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
