package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
