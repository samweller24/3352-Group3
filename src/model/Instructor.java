package src.model;

public class Instructor extends User {
    public String[] teaches;

    public Instructor(String userName, String email, String password, String[] teaches){
        super(userName,email, password);
        this.teaches = teaches;
    }

    public String[] getTeaches() {
        return teaches;
    }

    public void addCourseTaught(String course) {
        teaches[teaches.length] = course;
    }
}
