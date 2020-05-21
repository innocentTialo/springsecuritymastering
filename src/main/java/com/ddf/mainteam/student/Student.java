package com.ddf.mainteam.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by InnocentTIALO on 5/20/2020.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer studentId;
    private String studentName;

    @Override
    public String toString() {
        return new StringBuilder("Student{")
                .append("studentId=")
                .append(studentId)
                .append(", studentName='")
                .append(studentName)
                .append('\'')
                .append('}').toString();
    }
}
