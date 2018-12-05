package com.hillel.hometask13;

public class BookShelf {
    private int maxVolumeShelf = 10;

    private Book [] bookShelf = new Book[maxVolumeShelf];
    private static int counterAllBooks = 0;




    public void add(Book book) {
        if (isBookExists(book)) {
            return;
        }
            for (int i = 0; i < maxVolumeShelf; i++) {

                if (bookShelf[i] == null) {

                    bookShelf[i] = book;
                    counterAllBooks++;
                    return;
                }

            }
            System.out.println("The book shelf is full, you can't add any book");

    }

    public boolean isBookExists(Book book){

        for(Book elem: bookShelf){
            if(elem != null && elem.equals(book)) {

                    return true;
                }
        }
        return false;

    }


    public void showAllBooks(){
        for (Book element : bookShelf){
            if (element != null){
                element.printInfoBook();

            }
        }
    }
    public void countBooks(){
        int counter = 0;
        for (Book element : bookShelf){
            if (element != null){
                counter++;
            }
        }
        System.out.println( "The total number of books is " + counter + " books");
    }

    public static void countAllBooks (){
        System.out.println("The total number of all books on all book shelvs is " + counterAllBooks +" books");

    }








}
