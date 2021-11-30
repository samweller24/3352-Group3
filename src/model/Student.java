package src.model;

public class Student extends User {
    public String[] courseEnrollment;

    public Student(String userName, String email, String password, String[] courseEnrollment){
        super(userName,email, password);
        this.courseEnrollment = courseEnrollment;
    }

    public String[] getCourseEnrollment() {
        return courseEnrollment;
    }

    public void addEnrolledCourse(String course) {
        courseEnrollment[courseEnrollment.length] = course;
    }
}
