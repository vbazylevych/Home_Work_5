package goit.javaonline3;

import goit.javaonline3.arraysort.WorkWithArray;

import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class Runner {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");

        if (scanner.hasNextInt()) {
            int arrayLength = scanner.nextInt();

            if (arrayLength > 0) {
                int[] array = new int[arrayLength];

                System.out.println("Enter " + arrayLength + " elements of array.");

                for (int i = 0; i < arrayLength; i++) {
                    if (scanner.hasNextInt()) {
                        array[i] = scanner.nextInt();
                    } else {//http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-142311.html
                        System.out.println("You entered incorrect value of element. Please run program again");
                        return;
                    }
                }

                System.out.println("Min element is " + WorkWithArray.searchMin(array));
                System.out.println("Max element is " + WorkWithArray.searchMax(array));
                System.out.println("Sorted array is:");
                array = WorkWithArray.sortArray(array);
                WorkWithArray.printArray(array);
            } else {//http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-142311.html
                System.out.println("You entered incorrect value of length. Please run program again!");
            }
        } else {
            System.out.println("You entered incorrect value of length. Please run program again!");
        }
    }
}
