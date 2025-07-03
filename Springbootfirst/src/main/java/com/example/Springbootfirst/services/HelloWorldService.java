package com.example.Springbootfirst.services;

import com.example.Springbootfirst.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService
{
    List<Employee> emp = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prasanth", "Trainer"),
                    new Employee(2, "Yuvaraj", "Faculty")
            )
    );



    public List<Employee> getAllEmployees() {
        return emp;
    }

    public String GetMethod()
    {
        return "This is Get Method";
    }

    public String postmethod() {
        return "This is post Method";
    }
    public String PutMethod()
    {
        return "This is Put Method";
    }

    public String Deletemethod()
    {
        return "This is Delete Method";
    }

    public void addEmployee(Employee employee) {
        emp.add(employee);
    }
}
