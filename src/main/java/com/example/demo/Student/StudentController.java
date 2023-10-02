package com.example.demo.Student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Sebastian",
                        20,
                        LocalDate.of(2003, Month.JANUARY,10),
                        "srsebas101@gmail.com"
                )
        );
    }

}
