package userInput;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating simple interest \n");
        System.out.print("Enter Principal : ");
        int principal = sc.nextInt();
        System.out.print("Enter Rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter Time : ");
        int time = sc.nextInt();

        System.out.println("Calculating............");
        float simpleInterest = principal * rate * time / 100;

        System.out.println("The simple interest is : " + simpleInterest);


    }
}
