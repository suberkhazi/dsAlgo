package loops;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        System.out.println("Enter the Rating from 1 to 3");
        System.out.print("Enter your Rating : ");
        Scanner scan = new Scanner(System.in);
        int rating = scan.nextInt();

            switch (rating) {
                case 1:
                    System.out.println("Poor");
                    break;

                case 2:
                    System.out.println("Average");
                    break;

                case 3:
                    System.out.println("Best");
                    break;

                default:
                    System.out.println("Invalid Rating");
                    break;
            }
    }
}
