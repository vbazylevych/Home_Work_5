package goit.javaonline3.workwitharray;


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
        } catch (IllegalStateException e) {
            System.out.println("Your application is in incorrect state! We will try again");
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

    public static int getCorrectInt() {
        boolean CorrectValueOfInt = false;
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
        return correctInt;
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

//стр27
//getPositiveNonzeroInt - Correct - а что такое correct? не понятно. getPositiveNonzeroInt - может как-то так...
//весь correct (кроме разве что correctValueofInt) в этом классе - не особо информативно

//стр42
//AskArray - в этом методе массив и создается в том числе, а не только заполняется.
//Может createArray()... или даже askArray().. мы запрашиваем все данные для массива у пользователя. Может есть лучше вариант
//строки 50-53 - вот тут все таки AskArray()

//51
//getCorrectInt() - получить Инт уже подразумевает, что мы хотим Инт, а не Стринг. Correct - what for?

//correctValueofInt() - mistake in camelCase

//расположение методов в коде
