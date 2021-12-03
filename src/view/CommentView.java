package view;

import model.Comment;

public class CommentView {
    /**
     * Comment View
     *
     *
     * @param model - the model class of comment to get print details from
     */
    public void PrintCommentDetails(Comment model){
        System.out.println("Comment: ");
        System.out.println("Header: " + model.getHeader());
        System.out.println("Body: " + model.getBody());
        System.out.println("User Created By: " + model.getUserCreatedBy());
    }
}
