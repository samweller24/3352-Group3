package src.controller;
import src.model.Instructor;
import src.view.InstructorView;

public class InstructorController {
    private Instructor model;
    private InstructorView view;
     
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
        view.printInstructorDetails(model.getUserName(), model.getEmail(), model.getTeaches());
    }	
}
