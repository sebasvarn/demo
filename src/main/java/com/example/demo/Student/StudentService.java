package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

      public List<Student> getStudents(){
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
