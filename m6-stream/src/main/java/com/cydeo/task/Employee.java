package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int emId;
    private String empName;
    private String empEmail;
    private List<String> emPhoneNumbers;
}
