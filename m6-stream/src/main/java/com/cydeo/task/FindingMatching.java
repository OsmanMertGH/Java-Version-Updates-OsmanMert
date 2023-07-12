package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingMatching {
    public static void main(String[] args) {


        List<Dish> menu2 = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beee",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

        System.out.println("ALL MATCH");
        boolean isHealthy = menu2.stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if (menu2.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = menu2.stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish>dish= menu2.stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);

        System.out.println("FIND FIRST");
        Optional<Dish>dish2= menu2.stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);
    }
}
