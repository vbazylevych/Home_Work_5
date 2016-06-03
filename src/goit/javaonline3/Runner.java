package goit.javaonline3;

import goit.javaonline3.arraysort.ArraySort;
import goit.javaonline3.searchminandmax.SearchMinAndMax;

import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class Runner {

    public static void main(String[] args){

        int arrayLength = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        if(scanner.hasNextInt()) {
            arrayLength = scanner.nextInt();
            if(arrayLength > 0){
                System.out.println("Enter " + arrayLength + " elements of array.");
                if(scanner.hasNextInt()) {
                    int[] array = new int[arrayLength];
                    for(int i = 0; i < arrayLength; i++) {
                        array[i] = scanner.nextInt();
                    }
                    SearchMinAndMax CustomArray = new SearchMinAndMax();
                    CustomArray.searchMin(array);
                    CustomArray.searchMax(array);
                    ArraySort CustomArraySort= new ArraySort();
                    CustomArraySort.sortArray(array);
                }else {
                    System.out.println("You entered incorrect value of element. Please run program again");
                }
            }else{
                System.out.println("Yu enter incorrect length. Please run program again");            }

        }else {
            System.out.println("You entered incorrect value of length");
        }
    }
}
