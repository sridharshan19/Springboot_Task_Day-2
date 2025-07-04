package com.example.Task_Student_employee.Service;

import com.example.Task_Student_employee.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student>studentDetails = new ArrayList<>(
            Arrays.asList(new Student("Sabari", 20, "23EE10", "7825694215"),
                    new Student("Ravi", 19, "23EE053", "7896482536"))
    );
    public List<Student> getStudentDeteils() {
        return studentDetails;
    }

    public String studentName() {
        return "Student name is : Sabari";
    }


    public String studentAge() {
        return "Student Age is : 20";
    }

    public String studentMobileNumber() {
        return "Student Mobile Number is : 7825694215";
    }
}
