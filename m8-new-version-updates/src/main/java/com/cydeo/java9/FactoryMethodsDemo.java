package com.cydeo.java9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        //Creating unmodifiable list before Java9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        //courses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable List after Java9
        List<String> myCourses=List.of("Java","Spring","Agile");



    }
}
