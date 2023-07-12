package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "mike", "mike@cydeo.com", Arrays.asList("22554846", "594848512")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("2252432446", "52142148512")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("22124214846", "55425248512"))
        );
    }
}
