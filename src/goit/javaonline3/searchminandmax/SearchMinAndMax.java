package goit.javaonline3.searchminandmax;

/**
 * Created by Ler4enko on 02.06.2016.
 */
public class SearchMinAndMax {
//что если сделать эти методы статическими?
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
}

