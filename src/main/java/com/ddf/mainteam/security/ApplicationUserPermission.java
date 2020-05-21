package com.ddf.mainteam.security;

import lombok.Getter;

/**
 * Created by InnocentTIALO on 5/21/2020.
 */
@Getter
public enum ApplicationUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
