package com.hillel.hometask13;

public class Author {
    private String authorName;
    private int birthYear;

    public void setName(String name){
        authorName = name;
        System.out.println("Author is: " + name);

    }
    public void setBirthYear(int year){
        birthYear = year;
        System.out.println("Birth Year is: " + year);


    }

//    Конструктор

    Author(String name,int year){
        this.authorName = name;
        birthYear = year;


    }
    public void printInfo(){
        System.out.println("Author is: " + authorName);
        System.out.println("Birth Year is: " + birthYear);
        System.out.println();
    }



}
