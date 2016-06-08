package goit.javaonline3.workwitharray;


import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class WorkWithArray {

    public static int getCorrectInt() {
        boolean correctValueofInt = false;
        int correctInt = 0;

        while(!correctValueofInt) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                correctInt = scanner.nextInt();
                correctValueofInt = true;
            } else {
                System.out.println("You entered incorrect value. Please try again");
            }
        }
        return correctInt;
    }

    public static int getCorrectPositiveInt() {
        boolean correctValueofInt = false;
        int correctPositiveInt = 0;

        while(!correctValueofInt) {
            correctPositiveInt = getCorrectInt();
            if (correctPositiveInt <= 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                correctValueofInt = true;
            }
        }
        return correctPositiveInt;
    }

    public static int[] fillArray() {

        System.out.println("Enter array length.");

        int arrayLength = getCorrectPositiveInt();
        int[] array = new int[arrayLength];

        System.out.println("Enter " + arrayLength + " elements of array.");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = getCorrectInt();
        }
        return array;
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
//getCorrectPositiveInt - Correct - а что такое correct? не понятно. getPositiveNonzeroInt - может как-то так...
//весь correct (кроме разве что correctValueofInt) в этом классе - не особо информативно

//стр42
//fillArray - в этом методе массив и создается в том числе, а не только заполняется.
//Может createArray()... или даже askArray().. мы запрашиваем все данные для массива у пользователя. Может есть лучше вариант
//строки 50-53 - вот тут все таки fillArray()

//51
//getCorrectInt() - получить Инт уже подразумевает, что мы хотим Инт, а не Стринг. Correct - what for?

//correctValueofInt() - mistake in camelCase

//расположение методов в коде
