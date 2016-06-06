package goit.javaonline3.arraysort;
//зачем этот импорт?
import java.lang.reflect.Array;

/**
 * Created by Ler4enko on 03.06.2016.
 */
public class ArraySort {
    //что если сделать эти методы статическими?
    //Видя название sortArray, я бы подумала что этот метод вернет мне отсортированный массив.
    //это было бы логично - мотод возвращает нам массив и мы уже потом что хотим, то с ним и делаем
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
}
