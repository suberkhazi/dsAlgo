package loops;

import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        System.out.println("Practicing nested for loop");
        System.out.print("Enter the no tables : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = 0; i <= a; i++){
            for (int j = 1; j <= 10; j++){
                int res = i * j;
                System.out.println(i + " x " + j +" = " + res);
            }
            System.out.println();
        }
    }
}
