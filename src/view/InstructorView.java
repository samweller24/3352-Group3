package src.view;

public class InstructorView {
    public void printInstructorDetails(String userName, String email, String[] taughtCourses){
        System.out.println("Instructor: ");
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Taught Courses: " + taughtCourses);
    }
}
