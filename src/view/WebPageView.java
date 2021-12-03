package view;

import controller.ContentController;
import model.WebPage;

public class WebPageView {

    /**
     * WebPage View
     *
     *
     * @param model - the model class of WebPage to get print details
     *
     */
    public void printWebPageDetails(WebPage model){
        System.out.println("WebPageView: ");
        System.out.println("URL: " + model.getURL());
        System.out.println("Header: " + model.getHeader());
        System.out.println("Body: " + model.getSection());

        //create content controller for printing contents easily
        for(int i = 0; i < model.getContent().length; i ++){
            ContentController controller = new ContentController(model.getContent()[i], new ContentView());
            controller.updateView();
        }

    }
}
