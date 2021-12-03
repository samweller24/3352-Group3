package controller;

import model.Content;
import view.ContentView;

public class ContentController {
    private Content model;
    private ContentView view;


    /**
     * Content Controller
     *
     *
     * @param model - the Content model class that defines values
     * @param view - the Content view class that prints vales
     */
    public ContentController(Content model, ContentView view) {
        this.model = model;
        this.view = view;
    }

    public ContentView getView() {
        return view;
    }

    public void setView(ContentView view) {
        this.view = view;
    }

    public String getTitle() {
        return model.getTitle();
    }

    public void setTitle(String title) {
        model.setTitle(title);
    }

    public String getBody() {
        return model.getBody();
    }

    public void setBody(String body) {
        model.setBody(body);
    }

    public String getTypeOfMedia() {
        return model.getTypeOfMedia();
    }

    public void setTypeOfMedia(String typeOfMedia) {
        model.setTypeOfMedia(typeOfMedia);
    }

    public String getLinkedContent() {
        return model.getLinkedContent();
    }

    public void setLinkedContent(String linkedContent) {
        model.setLinkedContent(linkedContent);
    }

    public void updateView() {
        view.PrintContentDetails(model);
    }
}
