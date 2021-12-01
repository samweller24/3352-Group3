package src.view;

import src.controller.ContentController;
import src.model.Content;

public class WebPageView {
    public void printWebPageDetails(String URL, String header, String section, Content[] contents){
        System.out.println("WebPageView: ");
        System.out.println("URL: " + URL);
        System.out.println("Header: " + header);
        System.out.println("Body: " + section);
        System.out.println("Content: " + contents);

        for(int i = 0; i < contents.length; i ++){
            ContentController controller = new ContentController(contents[i], new ContentView());
            controller.updateView();
        }

    }
}
