package ch.hesge.tp02.program;

import ch.hesge.tp02.employee.TeachingEmployee;

public class Course {
    private TeachingEmployee teacher;
    private String name;

    public Course(TeachingEmployee teacher, String name) {
        this.teacher = teacher;
        this.name = name;
    }

    public TeachingEmployee getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}
