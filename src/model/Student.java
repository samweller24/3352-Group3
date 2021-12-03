package model;

public class Student extends User  {
    public String[] courseEnrollment;

    /**
     * Student class extends User
     *
     *
     * @param userName - the unique name of the user
     * @param email - the users email
     * @param password - the users password
     * @param courseEnrollment -
     */
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
