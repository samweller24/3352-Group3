package controller;

import model.Student;
import view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    /**
     * Student Controller
     *
     *
     * @param model - the Student model class that defines values
     * @param view - the Student view class that prints vales
     */
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String[] getCourseEnrollment() {
        return model.getCourseEnrollment();
    }

    public void addEnrolledCourse(String course) {
        model.addEnrolledCourse(course);
    }

    public String getEmail() {
        return model.getEmail();
    }

    public String getUserName() {
        return model.getUserName();
    }

    public String getPassword() {
        return model.getPassword();
    }

    public void setEmail(String email) {
        model.setEmail(email);
    }

    public void setUserName(String userName) {
        model.setUserName(userName);
    }

    public void setPassword(String password) {
        model.setPassword(password);
    }

    public void updateView(){
        view.printStudentDetails(model);
    }
}
