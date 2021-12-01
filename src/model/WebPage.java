package src.model;

import src.controller.ContentController;

public class WebPage {
    private String URL ;
    private String header;
    private String section;
    private Content[] contents;

    public WebPage(String header, String URL, String section, Content[] contents) {
        this.header = header;
        this.URL = URL;
        this.section = section;
        this.contents = contents;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Content[] getContent() {
        return contents;
    }

    public void setContent(Content[] content) {
        this.contents = content;
    }

    public void addContent(Content content){
        contents[contents.length-1] = content;
    }

    public Content editContent(int indexOf){
        return contents[indexOf];
    }

    public void setContentIndex(int indexOf, Content content){
        contents[indexOf] = content;
    }

}
