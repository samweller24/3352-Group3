package src.view;

import src.model.Course;

public class CourseView {
   public void printCourseDetails(Course course){
      System.out.println("Course: ");
      System.out.println("ID: " + course.getid());
      System.out.println("Section: " + course.getSection());
      System.out.println("Name: " + course.getName());
  } 
}
