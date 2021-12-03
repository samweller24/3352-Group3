package view;

import model.Student;

public class StudentView {

    /**
     * Student View
     *
     *
     * @param model - the model class of Student to get print details
     *
     */
    public void printStudentDetails(Student model){
        System.out.println("Student: ");
        System.out.println("Username: " + model.getUserName());
        System.out.println("Password: " + model.getPassword());
        System.out.println("Email: " + model.getEmail());
        System.out.println("Enrolled Courses: ");

        for(int i = 0; i < model.getCourseEnrollment().length; i ++){
            System.out.println(model.getCourseEnrollment()[i]);
        }
    } 
}
