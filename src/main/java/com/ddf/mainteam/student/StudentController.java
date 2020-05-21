package com.ddf.mainteam.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static com.ddf.mainteam.student.FakeData.STUDENTS;

/**
 * Created by InnocentTIALO on 5/20/2020.
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return STUDENTS
                .stream()
                .filter(student -> student.getStudentId() == studentId)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exist!"));
    }
}
