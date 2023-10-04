package ch.hesge.tp02.students;

import ch.hesge.tp02.employee.Permanent;
import ch.hesge.tp02.program.Course;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String code;
    private final List<Student> students = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();
    private Permanent responsible;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<Course> getCourses() {
        return courses;
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
