package model;

public class Novel extends Book {

    String type;


    public Novel(String title, String type, int numberOfPages) {
        super(title, numberOfPages);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.type = type;
    }
}