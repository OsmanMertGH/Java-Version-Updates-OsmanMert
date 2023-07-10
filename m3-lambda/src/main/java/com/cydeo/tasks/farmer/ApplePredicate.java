package com.cydeo.tasks.farmer;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}
