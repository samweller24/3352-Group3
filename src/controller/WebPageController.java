package src.controller;


import src.model.Comment;
import src.model.Content;
import src.model.WebPage;
import src.view.WebPageView;

public class WebPageController {
    private WebPage model;
    private WebPageView view;

    public WebPageController(WebPage comment, WebPageView view){
        this.model = comment;
        this.view = view;
    }

    public String getURL() {
        return model.getURL();
    }

    public void setURL(String URL) {
        model.setURL(URL);
    }

    public String getHeader() {
        return model.getHeader();
    }

    public void setHeader(String header) {
        model.setHeader(header);
    }

    public String getSection() {
        return model.getSection();
    }

    public void setSection(String section) {
        model.setSection(section);
    }

    public Content[] getContent() {
        return model.getContent();
    }

    public void setContent(Content[] content) {
        model.setContent(content);
    }

    public void addContent(Content content) {
        model.addContent(content);
    }

    public void updateView() {
        view.
    }



}
