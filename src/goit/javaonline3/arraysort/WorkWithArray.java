package goit.javaonline3.arraysort;
//зачем этот импорт?


import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class WorkWithArray {
    //что если сделать эти методы статическими?
    //Видя название sortArray, я бы подумала что этот метод вернет мне отсортированный массив.
    //это было бы логично - мотод возвращает нам массив и мы уже потом что хотим, то с ним и делаем
    public static int[] enterArray() {

        Scanner scanner = new Scanner(System.in);
        int[] array;

        System.out.println("Enter array length");
        if (scanner.hasNextInt()) {
            int arrayLength = scanner.nextInt();

            if (arrayLength > 0) {
                array = new int[arrayLength];
                System.out.println("Enter " + arrayLength + " elements of array.");

                for (int i = 0; i < arrayLength; i++) {
                    if (scanner.hasNextInt()) {
                        array[i] = scanner.nextInt();
                    } else {//http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-142311.html
                        System.out.println("You entered incorrect value of element. Please run program again");
                        array = null;
                        break;
                    }
                }
            } else {//http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-142311.html
                System.out.println("You entered incorrect value of length. Please run program again!");
                array = null;
            }
        } else {
            System.out.println("You entered incorrect value of length. Please run program again!");
            array = null;
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
    }
}

