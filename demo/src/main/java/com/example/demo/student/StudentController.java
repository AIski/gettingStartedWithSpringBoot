package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path="api/v1/student")

public class StudentController {

    @GetMapping
    //API LAYER
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Łukasz",
                        "lukasz.cojapacze@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        22)
        );
    }
}
