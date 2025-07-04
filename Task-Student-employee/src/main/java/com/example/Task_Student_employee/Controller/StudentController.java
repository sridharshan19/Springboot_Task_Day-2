package com.example.Task_Student_employee.Controller;

import com.example.Task_Student_employee.Service.StudentService;
import com.example.Task_Student_employee.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student>getStudentDetails()
    {
        return studentService.getStudentDeteils();
    }

    @GetMapping("/name")
    public String getStudentName(){
        return studentService.studentName();
    }

    @GetMapping("/age")
    public String getStudentAge(){
        return studentService.studentAge();
    }

    @GetMapping("/mobileNumber")
    public String getMobileNumber(){
        return studentService.studentMobileNumber();
    }


}
