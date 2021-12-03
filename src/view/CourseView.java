package view;

import model.Course;

public class CourseView {

   /**
    * Course View
    *
    *
    * @param model - the model class of Course to get print details
    *
    */
   public void printCourseDetails(Course model){
      System.out.println("Course: ");
      System.out.println("ID: " + model.getid());
      System.out.println("Section: " + model.getSection());
      System.out.println("Name: " + model.getName());
  } 
}
