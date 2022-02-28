package category;

import java.util.List;

import book.Book;

public class Category {
    private String nameCtegory;
    private List<Book> books;

    public Category(String nameCtegory, List<Book> books) {
        this.nameCtegory = nameCtegory;
        this.books = books;
    }

    public String getNameCtegory() {
        return nameCtegory;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setNameCtegory(String nameCtegory) {
        this.nameCtegory = nameCtegory;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
