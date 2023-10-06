package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository){
        return args -> {
            Student sebas = new Student(
                    "Sebastian",
                    LocalDate.of(2003, Month.JANUARY,10),
                    "srsebas101@gmail.com"
            );
            Student ara = new Student(
                    "Aracelli",
                    LocalDate.of(2002, Month.OCTOBER,9),
                    "aracelligenes@gmail.com"
            );
            repository.saveAll(
                    List.of(sebas,ara)
            );
        };

    }
}
