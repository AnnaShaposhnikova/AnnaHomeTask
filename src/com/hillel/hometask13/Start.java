package com.hillel.hometask13;

public class Start {

    public static void main(String[] args) {

//
//        Book kolobok = new Book();
//        Author authorKolobok = new Author();
//
//        kolobok.setName("Kolobok");
//        authorKolobok.setName("People");
//        authorKolobok.setBirthYear(8000);
//        kolobok.setNumOfPage(5);
//        kolobok.standOnShelf();
//        kolobok.isOnItsPlase();
//        System.out.println();
//
//
//
//        Book teremok = new Book();
//        Author authorTeremok = new Author();
//
//        teremok.setName("Teremok");
//        authorTeremok.setName("People");
//        authorTeremok.setBirthYear(8000);
//        teremok.setNumOfPage(7);
//        teremok.read();
//        teremok.isOnItsPlase();
//        System.out.println();
//
//        Book farytale = new Book ();
//        Author authorFary = new Author();
//
//        farytale.setName("Farytale about golen fish");
//        authorFary.setName("Pushkin");
//        authorFary.setBirthYear(1799);
//        farytale.setNumOfPage(25);
//        farytale.standOnShelf();
//        farytale.isOnItsPlase();
//        System.out.println();
//
//        Book borodino = new Book();
//        Author authorB = new Author();
//
//        borodino.setName("Borodino");
//        authorB.setName("Lermontov");
//        authorB.setBirthYear(1814);
//        borodino.setNumOfPage(15);
//        borodino.read();
//        borodino.isOnItsPlase();
//        System.out.println();
//
//        Book idiot = new Book();
//        Author authorIdiot = new Author();
//
//        idiot.setName("Idiot");
//        authorIdiot.setName("Dostoevsky");
//        authorIdiot.setBirthYear(1821);
//        idiot.setNumOfPage(640);
//        idiot.standOnShelf();
//        idiot.isOnItsPlase();
//        System.out.println();
//
//        Book java = new Book();
//        Author auhtorJava = new Author();
//
//        java.setName("Java");
//        auhtorJava.setName("Ivor Horton");
//        auhtorJava.setBirthYear(1957);
//        java.setNumOfPage(486);
//        java.read();
//        java.isOnItsPlase();
//        System.out.println();
//
//        Book sopromat = new Book();
//        Author authorSopromat = new Author();
//
//        sopromat.setName("Strength of matirials");
//        authorSopromat.setName("Pisarenko");
//        authorSopromat.setBirthYear(1948);
//        sopromat.setNumOfPage(736);
//        sopromat.standOnShelf();
//        sopromat.isOnItsPlase();
//        System.out.println();
//
//        Book ten = new Book();
//        Author authorTen = new Author();
//
//        ten.setName("Ten little niggers");
//        authorTen.setName("Agatha Cristie");
//        authorTen.setBirthYear(1890);
//        ten.setNumOfPage(215);
//        ten.read();
//        ten.isOnItsPlase();
//        System.out.println();
//
//        Book frankenstain = new Book();
//        Author authorFran = new Author();
//
//        frankenstain.setName("Frankenstain");
//        authorFran.setName("Mary Shalley");
//        authorFran.setBirthYear(1797);
//        frankenstain.setNumOfPage(450);
//        frankenstain.standOnShelf();
//        frankenstain.isOnItsPlase();
//        System.out.println();
//
//        Book encyclopedya = new Book();
//        Author authorEncyclop = new Author();
//
//        encyclopedya.setName("Encyclopedya of animals");
//        authorEncyclop.setName("Ivanov");
//        authorEncyclop.setBirthYear(1965);
//        encyclopedya.setNumOfPage(854);
//        encyclopedya.standOnShelf();
//        encyclopedya.isOnItsPlase();
//        System.out.println();
//
//        System.out.println("Authors");
//
//        Author pushkin = new Author();
//        pushkin.setName("Alexandr Pushkin");
//        pushkin.setBirthYear(1799);
//        System.out.println();
//
//        Author lermontov = new Author();
//        lermontov.setName("Mykhail Lermontov");
//        lermontov.setBirthYear(1814);
//        System.out.println();
//
//        Author dostoevsky = new Author();
//        dostoevsky.setName("Fedor Dostoevsky");
//        dostoevsky.setBirthYear(1821);
//        System.out.println();
//
//        Author cristie = new Author();
//        cristie.setName("Agatha Cristie");
//        cristie.setBirthYear(1890);
//        System.out.println();
//
//        Author shelley = new Author();
//        shelley.setName("Mary Shalley");
//        shelley.setBirthYear(1797);
//        System.out.println();

//// Использование конструктора

        System.out.println("Books: ");

        Book kolobok = new Book("Kolobok",5);
        kolobok.printInfoBook();
        Author kolobok1 = new Author("Narod", 8000);
        kolobok1.printInfo();


        Book teremok = new Book("Teremok", 7);
        teremok.printInfoBook();
        Author teremok1 = new Author("Narod", 8000);
        teremok1.printInfo();

        Book farytale = new Book("Farytale about golden fish",25);
        farytale.printInfoBook();
        Author farytale1 = new Author("Pushkin",1790);
        farytale1.printInfo();

        Book borodino = new Book("Borodino", 15);
        borodino.printInfoBook();
        Author borodono1 = new Author("Lermontov",1814);
        borodono1.printInfo();

        Book idiot = new Book("Idiot", 640);
        idiot.printInfoBook();
        Author idiot1 = new Author("Dostoevsky", 1821);
        idiot1.printInfo();

        Book java = new Book("Java",486);
        java.printInfoBook();
        Author java1 = new Author("Ivor Horton",1957);
        java1.printInfo();

        Book sopromat = new Book("Strength of matirials",736);
        sopromat.printInfoBook();
        Author sopromat1 = new Author("Pserenko",1948);
        sopromat1.printInfo();

        Book ten = new Book("Ten little niggers",215);
        ten.printInfoBook();
        Author ten1 = new Author("Agatha Cristie",1890);
        ten1.printInfo();

        Book fran = new Book("Frankenstain", 450);
        fran.printInfoBook();
        Author fran1 = new Author("Mary Shaley",1797);
        fran1.printInfo();

        Book encyclop = new Book("Encyclopedya of animals", 854);
        encyclop.printInfoBook();
        Author encyclop1 = new Author("Ivanov",1965);
        encyclop1.printInfo();


        System.out.println("Authors: ");


        Author pusshkin = new Author("Pushkin",1799);
        pusshkin.printInfo();
        Author lermontov = new Author("Lermontov", 1814);
        lermontov.printInfo();
        Author dostoevsky = new Author("Dostoevsky", 1821);
        dostoevsky.printInfo();
        Author cristie = new Author ("Agatha Cristie", 1890);
        dostoevsky.printInfo();
        Author shaley = new Author("Mary Shaley", 1797);
        shaley.printInfo();





    }


}
