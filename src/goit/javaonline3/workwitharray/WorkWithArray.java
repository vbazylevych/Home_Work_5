package goit.javaonline3.workwitharray;


import java.util.Scanner;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class WorkWithArray {

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
                    } else {
                        System.out.println("You entered incorrect value of element. Please run program again");
                        array = null;
                        break;
                    }
                }
            } else {
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

//стр24-32
//можно вынести в отдельный метод - fillArray(), например

//enterArray - очень большая вложенность циклов и условий. Если этого можно избежать - нужно избежать. Тут можно

//System.out.println("You entered incorrect value of element. Please run program again");
//array = null;
//break;
//
//если у нас есть цель цакончить цикл или выполенение метода досрочно, нам не обязательно возвращаться через все вложенности.
//Мы можем написать "return null;" в любом месте метода

//если делать
//return null
//если выделить отдельные методы полчитьИнтБольшеНуля() (для длины массива) и заполнитьМассивИнтами()
//тогда не будет этой огромной вложенности и кусков повторяющегося кода

//если сейчас сделать красиво эти методы и потом, по мере получения новых знаний,
//их дописывать - их можно будет копипастить из одной домашки в следующую)