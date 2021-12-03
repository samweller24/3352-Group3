package view;

import model.Instructor;

public class InstructorView {

    /**
     * Instructor View
     *
     *
     * @param model - the model class of Instructor to get print details
     *
     */
    public void printInstructorDetails(Instructor model){
        System.out.println("Instructor: ");
        System.out.println("Username: " + model.getUserName());
        System.out.println("Email: " + model.getEmail());
        System.out.println("Taught Courses: ");
        for(int i = 0; i < model.getTeaches().length; i ++){
            System.out.println(model.getTeaches()[i]);
        }
    }
}
