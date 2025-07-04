package com.example.Task_Student_employee.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private String rollNumber;
    private String mobileNumber;
}
