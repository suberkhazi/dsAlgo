package Arrays;

import java.util.Scanner;

//taking array as input and search for given num x print its index
public class Arrays {
    public static void main(String[] args){
        System.out.print("Enter the size of an array : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the elements of array size : "+ size);

        //scanning input
        for (int i=0; i<size; i++){
            numbers[i] = scan.nextInt();
        }

        //printing array elements
        for (int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }



        System.out.print("Enter the elements which you want to search : ");
        int element = scan.nextInt();

        for (int i=0; i<size; i++){
            if (numbers[i] == element){
                System.out.println("the element "+element + "found at " + (i=i+1) + "th index");
            }
            }
        }

    }

