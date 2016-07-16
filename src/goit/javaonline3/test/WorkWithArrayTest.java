package goit.javaonline3.test;

import goit.javaonline3.workwitharray.WorkWithArray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ler4enko on 16.07.2016.
 */
public class WorkWithArrayTest {
    final int[] array = {1, 5, 10, 3, 0, -1};
    final int[] sortedArray = {-1, 0, 1, 3, 5, 10};

    @Test
    public void testSortArray() throws Exception {
        assertArrayEquals(sortedArray, WorkWithArray.sortArray(array));
    }

    @Test
    public void testSearchMin() throws Exception {
      assertEquals(-1, WorkWithArray.searchMin(array), 0);
    }

    @Test
    public void testSearchMax() throws Exception {
        assertEquals(10, WorkWithArray.searchMax(array), 0);
    }
}