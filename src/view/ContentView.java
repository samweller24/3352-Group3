package view;

import model.Content;

public class ContentView {

    /**
     * Content View
     *
     *
     * @param model - the model class of content to get print details
     */
    public void PrintContentDetails(Content model){
        System.out.println("Content: ");
        System.out.println("Title: " + model.getTitle());
        System.out.println("Body: " + model.getBody());
        System.out.println("Type Of Media: " + model.getTypeOfMedia());
        System.out.println("linked Content: " + model.getLinkedContent());
    }
}
