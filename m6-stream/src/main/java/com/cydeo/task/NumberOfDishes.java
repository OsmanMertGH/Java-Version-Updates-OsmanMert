package com.cydeo.task;

import com.cydeo.DishData2;

public class NumberOfDishes {
    public static void main(String[] args) {
        //How would you count the number of dishes in a stream using the map and reduce methods?

        int result = DishData2.getAll().stream()
                .map(p -> 1)
                .reduce(0,(a,b)->a+b);

        System.out.println(result);

    }
}
