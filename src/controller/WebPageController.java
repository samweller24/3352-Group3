package controller;


import model.Content;
import model.WebPage;
import view.WebPageView;

public class WebPageController {
    private WebPage model;
    private WebPageView view;

    /**
     * WebPage Controller
     *
     *
     * @param model - the WebPage model class that defines values
     * @param view - the WebPage view class that prints vales
     */
    public WebPageController(WebPage model, WebPageView view){
        this.model = model;
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

    public Content editContent(int indexOf) {
        return model.editContent(indexOf);
    }

    public void setContentIndex(int indexOf, Content content) {
        model.setContentIndex(indexOf, content);
    }

    public void updateView(){
        this.view.printWebPageDetails(this.model);
    }
}
