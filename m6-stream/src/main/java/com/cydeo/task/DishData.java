package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishData {

    public static void main(String[] args) {


    List<Dish> menu = Arrays.asList(
            new Dish("pork",false,800,Type.MEAT),
            new Dish("beef",false,700,Type.MEAT),
            new Dish("chicken",false,400,Type.MEAT),
            new Dish("fries",true,530,Type.OTHER),
            new Dish("rice",true,350,Type.OTHER),
            new Dish("fruit",true,120,Type.OTHER),
            new Dish("pizza",true,550,Type.OTHER),
            new Dish("prawns",false,300,Type.FISH),
            new Dish("salmon",false,450,Type.FISH)
    );

    menu.stream()
            .filter(i->i.getCalories()<400)
            .map(Dish::getName)
            .forEach(System.out::println);

    menu.stream()
            .map(Dish::getName)
            .map(dish->dish.length())
            .forEach(System.out::println);


    menu.stream()
            .filter(dish->dish.getCalories()<400)
            .sorted(Comparator.comparing(Dish::getCalories))
            .map(Dish::getName)
            .forEach(System.out::println);

    }




}
