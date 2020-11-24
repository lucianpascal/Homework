package model;

public class Album extends Book {

    private String qualityOfPaper;

    public Album(String title, int numberOfPages, String qualityOfPaper) {
        super(title, numberOfPages);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.qualityOfPaper = qualityOfPaper;
    }
}





