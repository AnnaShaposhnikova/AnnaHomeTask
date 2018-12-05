package com.hillel.hometask13;

public class Book {
    private String name;
    private int numOfPage;
    private Author auhtor;


    public Book(String name, int numOfPage,  Author auhtor) {
        this.name = name;
        this.numOfPage = numOfPage;
        this.auhtor = auhtor;
    }

    public Book(String name, Author auhtor) {
        this.name = name;
        this.auhtor = auhtor;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }


    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;


    }
    public void setAuhtor(Author author) {

        this.auhtor = author;
    }


    public void printInfoBook() {
        System.out.println("Name is: " + name);
        System.out.println("Num of page is: " + numOfPage);
        auhtor.printInfo();

    }

    @Override
    public boolean equals (Object obj){
        Book incomeBook = (Book) obj;
        boolean comparedName = this.name.equals(incomeBook.name);
        boolean comparedNumOfPages = this.numOfPage == incomeBook.numOfPage;
        boolean comparedAuthor = this.auhtor == incomeBook.auhtor;

        if(comparedName && comparedNumOfPages && comparedAuthor){
            return true;
        }
        return false;
    }
}

