package src.view;

import src.model.Comment;
import src.model.Content;

public class WebPageView {
    public void printWebPageDetails(String URL, String header, Comment[] comments, String section, Content[] contents){
        System.out.println("WebPageView: ");
        System.out.println("URL: " + URL);
        System.out.println("Header: " + header);
        System.out.println("Body: " + section);

        String content = "";
        for(int i = 0; i < contents.length; i ++){
            Content curr = contents[i];
            content +=
                    ("Title: ") +
                    ("Body: " + curr.getHeader() + " ") +
                    ("TypeOfMedia: " + curr.getBody() + " ") +
                    ("LinkedContent: " + curr.getUserCreatedBy() + "\n");
        }
        System.out.println(comment);


    }
}
