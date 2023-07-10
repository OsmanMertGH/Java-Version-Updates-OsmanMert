package com.cydeo;

import com.cydeo.tasks.farmer.Apple;
import com.cydeo.tasks.farmer.ApplePredicate;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        System.out.println("*****************PREDICATE**************");

        Predicate<Integer> lesserThan = i -> i < 18;

        System.out.println(lesserThan.test(20));


        System.out.println("*****************CONSUMER**************");

        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(10);

        System.out.println("*****************BI CONSUMER**************");
        BiConsumer<Integer,Integer>  addTwo = (x,y) ->System.out.println(x+y);
        addTwo.accept(1,2);

    }
}
