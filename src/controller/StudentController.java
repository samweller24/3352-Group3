package src.controller;

import src.model.Student;
import src.view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;
     
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
     
    public void setStudentUserName(String userName){
        model.setUserName(userName);		
    }
     
    public String getStudentName(){
        return model.getUserName();		
    }
     
    public void setStudentEmail(String email){
        model.setEmail(email);		
    }
     
    public String getStudentEmail(){
        return model.getEmail();		
    }

    public void addCourse(String course){
        model.addEnrolledCourse(course);		
    }
     
    public String[] getCourseEnrollment(){
        return model.getCourseEnrollment();		
    }
     
    public void updateView(){				
        view.printStudentDetails(model.getUserName(), model.getEmail(), model.getCourseEnrollment());
    }	
}
