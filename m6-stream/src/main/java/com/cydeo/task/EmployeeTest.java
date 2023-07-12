package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print All Emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        System.out.println("Print All PhoneNumbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print All PhoneNumbers with DoubleColon");
        EmployeeData.readAll()
                .map(Employee::getEmPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
