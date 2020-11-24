package main;


import model.Album;
import model.Book;
import model.Novel;

public class LibraryCatalog {

    public static void main(String... args) {

        Book firstBook = new Book("AnaKarenina", 150);
        Book secondBook = new Book("Malena", 200);
        firstBook.addBook(secondBook);
        Novel firstNovel = new Novel("Aliens", "SF", 32);
        firstBook.addBook(firstNovel);
        Novel secondNovel = new Novel("OrientExpress", "mistery", 450);
        firstBook.deleteBook(secondNovel);
        Album firstAlbum = new Album("Photos", 23, "soft");
        firstBook.addBook(firstAlbum);
        firstBook.listBooks();

        System.out.println(firstBook.getNumberOfPages());
        System.out.println(firstNovel.getTitle());    }
}








}