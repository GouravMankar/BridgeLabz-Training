package com.constructors.levelone;

//Course class demonstrates class variable and methods
class Course {
 String courseName;
 int duration;
 double fee;
 static String instituteName = "RGPV"; // Shared by all courses

 Course(String courseName, int duration, double fee) {
     this.courseName = courseName;
     this.duration = duration;
     this.fee = fee;
 }

//method to display course details 
 void displayCourseDetails() {
     System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee +
                        ", Institute: " + instituteName);
 }

// method to update institute name 
 static void updateInstituteName(String newName) {
     instituteName = newName;
 }

 public static void main(String[] args) {
     Course c1 = new Course("Java Programming", 6, 10000);
     Course c2 = new Course("Python Programming", 4, 8000);

     c1.displayCourseDetails();
     c2.displayCourseDetails();

     Course.updateInstituteName("Technocrats institute of technoloyg and science");
     c1.displayCourseDetails();
     c2.displayCourseDetails();
 }
}
