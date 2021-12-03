package model;

public class Comment {
    public String header;
    public String body;
    public String userCreatedBy;


    /**
     * Comment Model
     *
     *
     * @param header - the header of the comment
     * @param body - the contents of the comment
     * @param userCreatedBy - the user who created the comment
     *
     */
    public Comment(String header, String body, String userCreatedBy) {
        this.header = header;
        this.body = body;
        this.userCreatedBy = userCreatedBy;
    }

    public String getHeader(){
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setUserCreatedBy(String userCreatedBy) {
        this.userCreatedBy = userCreatedBy;
    }

    public String getUserCreatedBy() {
        return this.userCreatedBy;
    }
}

