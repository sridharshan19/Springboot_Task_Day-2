package com.example.Springbootfirst.controllers;

import com.example.Springbootfirst.models.Employee;
import com.example.Springbootfirst.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloworldController
{
    @Autowired
    HelloWorldService hws;
    @GetMapping("/")
    public String hello()
    {
        return hws.GetMethod();
    }
    @PostMapping("/")
    public String postmethod()
    {
        return hws.postmethod();
    }
    @PutMapping("/")
    public String PutMethod()
    {
        return hws.PutMethod();
    }

    @DeleteMapping("/")
    public String Deletemethod()
    {
        return hws.Deletemethod();
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return hws.getAllEmployees();
    }

    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        hws.addEmployee(employee);
        return "Employee added successfully";
    }
}
