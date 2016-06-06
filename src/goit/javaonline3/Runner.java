package goit.javaonline3;

import goit.javaonline3.arraysort.WorkWithArray;


/**
 * Created by Ler4enko on 03.06.2016.
 */
public class Runner {

    public static void main(String[] args){
        int[] array = WorkWithArray.enterArray();

        if (array != null) {
            System.out.println("Min element is " + WorkWithArray.searchMin(array));
            System.out.println("Max element is " + WorkWithArray.searchMax(array));
            System.out.println("Sorted array is:");
            WorkWithArray.sortArray(array);
            WorkWithArray.printArray(array);
        }
    }
}
