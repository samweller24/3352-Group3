package model;

public class Content {
    private String title;
    private String body;
    private String typeOfMedia;
    private String linkedContent;

    /**
     * Content Model
     *
     *
     * @param title - The Title of the content
     * @param body - the contents of the the body
     * @param typeOfMedia - the type of media
     * @param linkedContent - the link to other content
     *
     */
    public Content(String title, String body, String typeOfMedia, String linkedContent) {
        this.title = title;
        this.body = body;
        this.typeOfMedia = typeOfMedia;
        this.linkedContent = linkedContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTypeOfMedia() {
        return typeOfMedia;
    }

    public void setTypeOfMedia(String typeOfMedia) {
        this.typeOfMedia = typeOfMedia;
    }

    public String getLinkedContent() {
        return linkedContent;
    }

    public void setLinkedContent(String linkedContent) {
        this.linkedContent = linkedContent;
    }
}
