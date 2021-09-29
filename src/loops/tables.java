package loops;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        System.out.println("Printing Tables");
        System.out.print("Enter the number to print a table : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = 0; i <= 10; i++){
            int res = a * i;
            System.out.println(a + " x " + i +" = " + res);
        }
    }
}
