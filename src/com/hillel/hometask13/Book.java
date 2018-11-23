package com.hillel.hometask13;

public class Book {
    private String name;
    private int numOfPage;
    private boolean onItsPlase;
    private Author auhtor;


    public void read() {
        onItsPlase = false;


    }

    public void standOnShelf() {
        onItsPlase = true;

    }

    public boolean isOnItsPlase() {
        if (onItsPlase == false) {
            System.out.println("Somebody reading the book");
        } else {
            System.out.println("Nobody reading the book");
        }
        return onItsPlase;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);

    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
        System.out.println("Num of page is: " + numOfPage);

    }

    // Конструктор класса Book
    Book(String name, int numOfPage) {
        this.name = name;
        this.numOfPage = numOfPage;

    }

    public void printInfoBook() {
        System.out.println("Name is: " + name);
        System.out.println("Num of page is: " + numOfPage);



    }
}

