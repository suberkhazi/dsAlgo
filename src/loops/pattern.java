package loops;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Printing star pattern");
        System.out.print("Enter the n : ");
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();

       for (int i = 1; i <= n; i++){
           for (int j = 1; j <=n; j++){
               System.out.print("* ");
           }
           System.out.println("");
       }
    }
}
