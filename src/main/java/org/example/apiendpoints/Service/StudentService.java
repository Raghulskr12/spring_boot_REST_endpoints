package org.example.apiendpoints.Service;

import org.example.apiendpoints.Modals.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService { ;
    List<Student> students = new ArrayList<>(
            Arrays.asList(new Student(1,"Raghul","raghul@gmail.com"),
            new Student(2,"Gowri","gowri@gmail.com"),
    new Student(3,"ahad","ahad@gmail.com")));


    public List<Student> ListStudents() {
        return students;
    }

    public Student GetStudent(String rollNo) {
        return students.get(Integer.parseInt(rollNo)-1);
    }
}
