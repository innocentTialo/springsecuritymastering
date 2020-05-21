package com.ddf.mainteam.student;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by InnocentTIALO on 5/21/2020.
 */
@Component
public class FakeData {

    public static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "KENGNE PAUL"),
            new Student(2, "Tagne Jean-Marie"),
            new Student(3, "KEMMOGNE RENE"),
            new Student(4, "KUIPOU Flaubert")
    );
}
