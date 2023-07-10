package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort=()-> System.out.println("Quick Sorting");

    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
