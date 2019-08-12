package sorting;

public class SelectionSort {

    public Comparable[] sort(Comparable[] input) {
        for (int index = 0; index < input.length; index++) {
            int minIndex = index;
            for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
                if (less(input[innerIndex], input[minIndex])) minIndex = innerIndex;
            }
            exchange(input, index, minIndex);
        }
        return input;
    }

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
