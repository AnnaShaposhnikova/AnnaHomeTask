package com.hillel.hometask15;

public class Main {
    public static void main(String[] args) {

        Vehicle telega = new Vehicle(200, Color.brown);
        telega.setSpeed(10);
        telega.move();
        telega.setSpeed(0);
        telega.move();


        Plane boieng = new Plane(1000, Color.white,398);
        boieng.bookTicket(300);
        boieng.bookTicket(98);
        boieng.bookTicket(200);
        boieng.fly();


        Train chaika = new Train(10000, Color.blue, 25);
        chaika.setColor(Color.green);
        chaika.changeColor();
        chaika.setColor(Color.yellow);
        chaika.changeColor();



    }
}
