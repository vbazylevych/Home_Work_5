package goit.javaonline3.arraysort;

import java.lang.reflect.Array;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class ArraySort {

    public void sortArray(int[] array){

       for(int j = array.length - 1; j > 0; j--){
           for(int i = 0; i < j; i++){
               if(array[i] > array[i + 1]) {
                   int temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
               }
           }
       }
        System.out.println("Sorted array is:");
        for(int element : array){
            System.out.print(" " + element + " ");
        }
    }
}
