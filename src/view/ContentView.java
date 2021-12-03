package src.view;

public class ContentView {
    public void PrintContentDetails(String title, String body, String typeOfMedia, String linkedContent){
        System.out.println("Comment: ");
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);
        System.out.println("Type Of Media: " + typeOfMedia);
        System.out.println("linked Content: " + linkedContent);
    }
}
