package ch.hesge.tp02.students;

import ch.hesge.tp02.employee.Permanent;
import ch.hesge.tp02.program.Course;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Class {
    private String code;
    private List<Student> students;
    private List<Course> courses;
    private Permanent responsible;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Class() {
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student s) throws Exception {
        if(students.size()<20){
            this.students.add(s);
        }else{
            // TODO : Create a custom exceptions
            throw new Exception();
        }
    }

    public List<Student> getClassStudents(){
        // TODO : Return a clone to avoid adding students without using the proper methods
        return this.students;
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public Permanent getResponsible() {
        return responsible;
    }

    public void setResponsible(Permanent responsible) {
        this.responsible = responsible;
    }

}
