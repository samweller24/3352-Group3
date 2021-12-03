package controller;

import model.Comment;
import view.CommentView;

public class CommentController {
    private Comment model;
    private CommentView view;

    /**
    * Comment Controller
    *
    * @param model - the comment model class that defines values
     * @param view - the comment view class that prints vales
    */
    public CommentController(Comment model, CommentView view){
        this.model = model;
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
        this.view.PrintCommentDetails(model);
    }
}
