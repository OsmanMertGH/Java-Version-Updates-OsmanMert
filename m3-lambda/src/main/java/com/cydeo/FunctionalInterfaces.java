package com.cydeo;

import com.cydeo.tasks.farmer.Apple;
import com.cydeo.tasks.farmer.ApplePredicate;

import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        //******************PREDICATE*********************//

        Predicate<Integer> lesserThan = i -> i < 18;

        System.out.println(lesserThan.test(20));


    }
}
