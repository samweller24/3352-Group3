package src.model;

public class Comment {
    public String header;
    public String body;
    public String userCreatedBy;

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

