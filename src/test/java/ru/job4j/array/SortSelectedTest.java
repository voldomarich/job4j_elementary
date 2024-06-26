package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.array.SortSelected;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {30, 10, 20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {399, 150, 210, 418};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {150, 210, 399, 418};
        Assert.assertArrayEquals(expected, result);
    }
}
