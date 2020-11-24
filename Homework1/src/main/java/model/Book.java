package model;

public class Book {

    public String title;
    public int numberOfPages;


    public Book(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages = numberOfPages;


    }

    public String getTitle() {
        return title;
    }

    // void => no return type
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

     // void => no return type
    public void setNumberOfPages(int newNumberOfPages) {
        numberOfPages = newNumberOfPages;
    }

    public void addBook(Book secondBook) {}

    public void deleteBook(Book firstAlbum) {}

    public void listBooks() {}
}
