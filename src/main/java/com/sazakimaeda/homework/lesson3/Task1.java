package com.sazakimaeda.homework.lesson3;

public class Task1 {
    private String nameBook;
    private String author;
    private int pages;
    private boolean doc;

    public Task1(String nameBook, String author, int pages) {
        this.nameBook = nameBook;
        this.author = author;
        this.pages = pages;
    }

    public int howManyPages() {
        return pages * 40;
    }

    public int many(int howManyPages){
        return howManyPages * 40;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }
}
