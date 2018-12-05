package com.hillel.hometask13;

public class Start {

    public static void main(String[] args) {


        System.out.println("Books: ");


        Author kolobok1 = new Author("Narod", 8000);
        Book kolobok = new Book("Kolobok",5, kolobok1);
        kolobok.printInfoBook();

        Author teremok1 = new Author("Narod", 8000);
        Book teremok = new Book("Teremok", 7, teremok1);
        teremok.printInfoBook();

        Author farytale1 = new Author("Pushkin",1790);
        Book farytale = new Book("Farytale about golden fish",25, farytale1);
        farytale.printInfoBook();

        Author borodono1 = new Author("Lermontov",1814);
        Book borodino = new Book("Borodino", 15, borodono1);
        borodino.printInfoBook();

        Author idiot1 = new Author("Dostoevsky", 1821);
        Book idiot = new Book("Idiot", 640,idiot1);
        idiot.printInfoBook();

        Author java1 = new Author("Ivor Horton",1957);
        Book java = new Book("Java",486,java1);
        java.printInfoBook();

        Author sopromat1 = new Author("Pisarenko",1948);
        Book sopromat = new Book("Strength of matirials",736,sopromat1);
        sopromat.printInfoBook();

        Author ten1 = new Author("Agatha Cristie",1890);
        Book ten = new Book("Ten little niggers",215,ten1);
        ten.printInfoBook();

        Author fran1 = new Author("Mary Shaley",1797);
        Book fran = new Book("Frankenstain", 450, fran1);
        fran.printInfoBook();

        Author encyclop1 = new Author("Ivanov",1965);
        Book encyclop = new Book("Encyclopedya of animals", 854, encyclop1);
        encyclop.printInfoBook();


        System.out.println("Authors: ");


        Author pushkin = new Author("Pushkin",1799);
        pushkin.printInfo();
        Author lermontov = new Author("Lermontov", 1814);
        lermontov.printInfo();
        Author dostoevsky = new Author("Dostoevsky", 1821);
        dostoevsky.printInfo();
        Author cristie = new Author ("Agatha Cristie", 1890);
        cristie.printInfo();
        Author shaley = new Author("Mary Shaley", 1797);
        shaley.printInfo();

        System.out.println("Book shelf");
        System.out.println();


        BookShelf bookShelf1 = new BookShelf();
        bookShelf1.add(kolobok);
        bookShelf1.add(teremok);
        bookShelf1.add(farytale);
        bookShelf1.add(borodino);
        bookShelf1.add(idiot);


        bookShelf1.showAllBooks();
        bookShelf1.countBooks();


        BookShelf bookShelf2 = new BookShelf();
        Book b1 = new Book("Евгений Онегин", 450, pushkin);
        Book b2 = new Book("Руслан и Людмила",315,pushkin);
        Book b3 = new Book("Метель", 250,pushkin);
        Book b4 = new Book("станционный смотритель", 125,pushkin);

        bookShelf2.add(b1);
        bookShelf2.add(b2);
        bookShelf2.add(b3);
        bookShelf2.add(b4);

        bookShelf2.showAllBooks();
        bookShelf2.countBooks();

        BookShelf bookShelf3 = new BookShelf();
        bookShelf3.add(ten);
        bookShelf3.add(encyclop);
        bookShelf3.add(encyclop);
        bookShelf3.add(encyclop);


        bookShelf3.showAllBooks();
        bookShelf3.countBooks();


        BookShelf.countAllBooks();










    }


}
