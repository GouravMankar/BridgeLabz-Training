package com.campusconnect;
import java.util.*;

public class Course {
    private String courseName;
    private Faculty faculty;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public String getCourseName() { return courseName; }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void printCourse() {
        System.out.println("Course: " + courseName + ", Faculty: " + faculty.name + ", Students: " + students.size());
    }
}
