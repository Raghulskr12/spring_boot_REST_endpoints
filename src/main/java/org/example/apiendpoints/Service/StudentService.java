package org.example.apiendpoints.Service;

import org.example.apiendpoints.Modals.Student;
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

    public void AddStudent(Student student) {
        students.add(student);
    }

    public void UpdateStudent(Student student) {
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(student.getRollNo() == students.get(i).getRollNo()) {
                index = i;
                break;
            }
        }
        students.set(index, student);
    }
}
