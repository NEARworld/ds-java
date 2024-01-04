package array_list;

/* Integer is object. (wrapper class)
   Integer array can contain null values
   'final' keyword makes the variable to be constant */
public class IntegerArrayList {
    private Integer[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 3;
    public IntegerArrayList() {
        /* Integer[] contains null
           int[] contains 0s */
        items = new Integer[DEFAULT_CAPACITY];
        size = 0;
    }

    public IntegerArrayList(int n) {
        items = new Integer[n];
        size = 0;
    }

    public void add(int idx, int value) {
        if (idx < 0 || idx > size || size >= items.length) {
            throw new RuntimeException("Something went wrong");
        }
        for (int i = size-1; i >= idx; --i) {
            items[i + 1] = items[i];
        }
        items[idx] = value;
        size++;
    }

    public void traverse() {
        for (int i = 0; i < size; ++i) {
            System.out.print("| ");
            System.out.print(items[i] + " ");
        }
        System.out.print("|");
    }
}

