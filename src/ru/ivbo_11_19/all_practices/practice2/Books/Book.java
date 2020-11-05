package ru.ivbo_11_19.all_practices.practice2.Books;
public class Book {

    String name;
    String author;
    int pages;

    //Я решила добавить конструктор 16.09.2020
    public Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        String s = '\n'+"Book name - " + name + '\n' + "Author - " + author + '\n' + "Pages - " + pages;
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


}
