package src.view;

public class CommentView {
    public void PrintCommentDetails(String header, String body, String userCreatedBy){
        System.out.println("Comment: ");
        System.out.println("Header: " + header);
        System.out.println("Body: " + body);
        System.out.println("User Created By: " + userCreatedBy);
    }
}
