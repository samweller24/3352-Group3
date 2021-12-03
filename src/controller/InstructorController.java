package controller;

import model.Instructor;
import view.InstructorView;

public class InstructorController {
    private Instructor model;
    private InstructorView view;


    /**
     * Instructor Controller
     *
     *
     * @param model - the Instructor model class that defines values
     * @param view - the Instructor view class that prints vales
     */
    public InstructorController(Instructor model, InstructorView view){
        this.model = model;
        this.view = view;
    }
     
    public void setInstructorUserName(String userName){
        model.setUserName(userName);		
    }
     
    public String getInstructorName(){
        return model.getUserName();		
    }
     
    public void setInstructorEmail(String email){
        model.setEmail(email);		
    }
     
    public String getInstructorEmail(){
        return model.getEmail();		
    }

    public void addCourse(String course){
        model.addCourseTaught(course);		
    }
     
    public String[] getTeaches(){
        return model.getTeaches();		
    }
     
    public void updateView(){				
        view.printInstructorDetails(model);
    }	
}
