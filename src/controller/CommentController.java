package src.controller;

import src.model.Comment;
import src.view.CommentView;

public class CommentController {
    private Comment model;
    private CommentView view;

    public CommentController(Comment comment, CommentView view){
        this.model = comment;
        this.view = view;
    }

    public void setHeader(String header){
        model.setHeader(header);
    }

    public String getHeader(){
        return model.getHeader();
    }

    public void setBody(String body) {
        this.model.setBody(body);
    }

    public String getBody() {
        return model.getBody();
    }

    public void setUserCreatedBy(String userCreatedBy) {
        this.model.setUserCreatedBy(userCreatedBy);
    }

    public String getUserCreatedBy() {
        return this.model.getUserCreatedBy();
    }

    public void updateView(){
        this.view.PrintCommentDetails(this.model.getHeader(), this.model.getBody(), this.model.getUserCreatedBy());
    }
}
