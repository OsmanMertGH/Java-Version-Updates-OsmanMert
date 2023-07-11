package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));


        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(Comparator.comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));
    }
}