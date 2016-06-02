package goit.javaonline3.searchminandmax;

/**
 * Created by Ler4enko on 02.06.2016.
 */
public class SearchMinAndMax {

    public void searchMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length ; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min element is " + min);
    }

    public void searchMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max element is " + max);
    }
}

