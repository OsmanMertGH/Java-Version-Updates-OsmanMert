package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false;

        Calculate sum = (x, y) -> System.out.println(x + y);

        Calculate s1 = (x, y) -> Calculator.findSum(x, y);

        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 20);

        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;
        s3.calculate(10, 20);

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;

        Function<Integer, Double> m1 = new MyClass()::method;

        BiFunction<MyClass, Integer, Double> m2 = MyClass::method;

    }
}
