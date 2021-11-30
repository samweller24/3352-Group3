package src.view;

public class StudentView {
    public void printStudentDetails(String userName, String email, String[] courseEnrollment){
        System.out.println("Student: ");
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Enrolled Courses: " + courseEnrollment);
    } 
}
