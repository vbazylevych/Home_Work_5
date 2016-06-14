package goit.javaonline3.workwitharray;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class WorkWithArray {

    public static int[] AskArray() throws NullPointerException {

        System.out.println("Enter array length.");

        try {
            int arrayLength = getPositiveNonzeroInt();
            int[] array = new int[arrayLength];

            System.out.println("Enter " + arrayLength + " elements of array.");
            for (int i = 0; i < arrayLength; i++) {
                array[i] = getCorrectInt();
            }
            return array;
        } catch (InputMismatchException e) {
            System.out.println("Last entered value is incorrect");
            return null;
        }
    }

    public static int getPositiveNonzeroInt() {
        boolean correctValueofInt = false;
        int PositiveInt = 0;

        while(!correctValueofInt) {
            PositiveInt = getCorrectInt();
            if (PositiveInt <= 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                correctValueofInt = true;
            }
        }
        return PositiveInt;
    }

    public static int getCorrectInt() throws InputMismatchException{
  /*      boolean CorrectValueOfInt = false;
        int correctInt = 0;

        while(!CorrectValueOfInt) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                correctInt = scanner.nextInt();
                CorrectValueOfInt = true;
            } else {
                System.out.println("You entered incorrect value. Please try again");
            }
        }
        return correctInt; */
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

//AskArray(), correctValueofInt() - некорректное название для метода, согласно code convention

//PositiveInt - некорректное название для переменной, согласно code convention

//getCorrectInt() - получить Инт уже подразумевает, что мы хотим Инт, а не Стринг. Correct - what for?
//чем отличается getCorrectInt от getInt()? Какой смысл несет слово correct?

//закоментированный код не нужно оставлять. Не бойтесь с ним расстаться