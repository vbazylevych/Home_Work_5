package goit.javaonline3;

import goit.javaonline3.workwitharray.WorkWithArray;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class Runner {

     public static void main(String[] args) {
         runApplication();
     }

    private static void runApplication() {
        try{
            handleArray();
        } catch (NullPointerException e) {
            System.out.println("AskArray() method returns null. We will continue from start");
            runApplication();
        }
    }

    private static void handleArray() {
        int[] array = WorkWithArray.askArray();

        System.out.println("Min element is " + WorkWithArray.searchMin(array));
        System.out.println("Max element is " + WorkWithArray.searchMax(array));
        System.out.println("Origin array is:");
        WorkWithArray.printArray(array);
        System.out.println("Sorted array is:");
        WorkWithArray.sortArray(array);
        WorkWithArray.printArray(array);
    }
}


//рекурсия тут - не самое лучшее решение. Мы ее совершенно тут не контролируем, пользователь может вызвать метод
//сколько угодное количество раз и программа может закончиться аварийно