package Arrays;
import java.util.Scanner;


public class twoDArray {
    public static void main(String args[]){
        System.out.println("searching for an element");
        System.out.print("Enter the number of rows : ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of matrix : ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix[i][j]=scan.nextInt();
            }
        }

        System.out.println("Printing the matrix");
        for (int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean found=false;

        System.out.print("Enter the number you want to search : ");
        int number= scan.nextInt();
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (number == matrix[i][j]){
                    System.out.println("The "+number+" is found at matrix[" +(i+1)+"]["+(j+1)+"]" );
                    found=true;
                }
            }
        }

        if(found==false){
            System.out.println("Didnt found "+number+" in the matrix");
        }


    }
}
