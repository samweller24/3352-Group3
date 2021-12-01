package src.controller;

import src.model.Course;
import src.view.CourseView;

public class CourseController {
   private Course model;
   private CourseView view;

   public CourseController(Course model, CourseView view){
      this.model = model;
      this.view = view;
   }

   public void setCourseId(String id){
      model.setid(id);
   }

   public void setCourseSection(String section){
      model.setSection(section);
   }

   public void setCourseName(String name){
      model.setName(name);
   }

   public String getCourseId(){
      return model.getid();
   }

   public String getCourseSection(){
      return model.getSection();
   }

   public String getCourseName(){
      return model.getName();
   }

   public void updateView(){
      view.printCourseDetails(model);
   }
}
