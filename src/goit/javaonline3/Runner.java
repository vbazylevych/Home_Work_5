package goit.javaonline3;

import goit.javaonline3.workwitharray.WorkWithArray;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class Runner {

     public static void main(String[] args) {

         try{
             runApplication();
         } catch (NullPointerException e) {
             System.out.println("AskArray() method returns null. We will try again");

             runApplication();
         }
     }

    public static void runApplication() {
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