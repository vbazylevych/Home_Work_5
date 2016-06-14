package goit.javaonline3;

import goit.javaonline3.workwitharray.WorkWithArray;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class Runner {

     public static void main(String[] args) {
         runApplication();
     }

    public static void runApplication() {
        try{
            handleAray();
        } catch (NullPointerException e) {
            System.out.println("AskArray() method returns null. We will continue from start");
            runApplication();
        }
    }

    public static void handleAray() {
        int[] array = WorkWithArray.AskArray();

        System.out.println("Min element is " + WorkWithArray.searchMin(array));
        System.out.println("Max element is " + WorkWithArray.searchMax(array));
        System.out.println("Origin array is:");
        WorkWithArray.printArray(array);
        System.out.println("Sorted array is:");
        WorkWithArray.sortArray(array);
        WorkWithArray.printArray(array);
    }
}

//Aray - grammar mistake

//runApplication(), handleAray() - почему бы не сделать эти методы приватными?

//рекурсия тут - не самое лучшее решение. Мы ее совершенно тут не контролируем, пользователь может вызвать метод
//сколько угодное количество раз и прграмма может закончиться аварийно