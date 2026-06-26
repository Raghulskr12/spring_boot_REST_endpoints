package org.example.apiendpoints.Modals;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;



@Data
@AllArgsConstructor
public class Student {

    private int RollNo;
    private String Name;
    private String email;

}

