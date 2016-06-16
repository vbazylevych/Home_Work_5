package goit.javaonline3.workwitharray;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class WorkWithArray {

    public static int[] askArray() throws NullPointerException {

        System.out.println("Enter array length.");

        try {
            int arrayLength = getPositiveNonzeroInt();
            int[] array = new int[arrayLength];

            System.out.println("Enter " + arrayLength + " elements of array.");
            for (int i = 0; i < arrayLength; i++) {
                array[i] = getInt();
            }
            return array;
        } catch (InputMismatchException e) {
            System.out.println("Last entered value is incorrect");
            return null;
        }
    }

    public static int getPositiveNonzeroInt() {
        boolean correctValueOfInt = false;
        int positiveInt = 0;

        while(!correctValueOfInt) {
            positiveInt = getInt();
            if (positiveInt <= 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                correctValueOfInt = true;
            }
        }
        return positiveInt;
    }

    public static int getInt() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] sortArray(int[] array){

       for (int j = array.length - 1; j > 0; j--) {
           for (int i = 0; i < j; i++){
               if(array[i] > array[i + 1]) {
                   int temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
               }
           }
       }
       return array;
    }

    public static int searchMin(int[] array){
        int min = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int searchMax(int[] array){
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

/*
метод sortArray() можно сделать void

методы getInt(), getPositiveNonzeroInt() не смотрятся в классе WorkWithArray

каждый раз когда мы хотим получить Инт нужно создавать обьект Сканнер?
*/