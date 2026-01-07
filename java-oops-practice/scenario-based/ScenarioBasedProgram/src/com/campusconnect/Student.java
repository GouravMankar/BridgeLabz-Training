package com.campusconnect;
import java.util.*;

public class Student extends Person implements ICourseActions {
    private Map<Course, Integer> grades = new HashMap<>();

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void addGrade(Course c, int grade) {
        grades.put(c, grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        int total = 0;
        for (int g : grades.values()) total += g;
        return total / (double) grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    @Override
    public void printDetails() {
        System.out.println("Student -> ID: " + id + ", Name: " + name + ", GPA: " + calculateGPA());
    }
}
