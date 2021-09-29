package pattern;

import java.util.Scanner;

public class solidRect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = scan.nextInt();
        System.out.print("Enter the columns : ");
        int m = scan.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
