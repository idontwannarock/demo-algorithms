package sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    private SelectionSort selectionSort;

    @Before
    public void init() {
        this.selectionSort = new SelectionSort();
    }

    @Test
    public void shouldReturnAEELMOPRSTX() {
        String[] input = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        String[] expected = {"A", "E", "E", "L", "M", "O", "P", "R", "S", "T", "X"};
        assertArrayEquals(expected, selectionSort.sort(input));
    }
}
