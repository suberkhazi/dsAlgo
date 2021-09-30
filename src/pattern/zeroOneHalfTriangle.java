package pattern;

import java.util.Scanner;

public class zeroOneHalfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = scan.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                //if number is even return 1 else return zero
                int sum = i+j;
                if(sum % 2 == 0){   // its even number
                    System.out.print("1 ");
                } else {    // its odd number
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
