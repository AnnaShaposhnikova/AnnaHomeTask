package com.hillel.hometask17;

public class Main {
    public static void main(String[] args) {

        Dog tusik = new Dog(2,15, Animal.Color.RED,"Tusik");
        tusik.say();

        Cat masyanya = new Cat(10,14, Animal.Color.WHITE, "Masyanya");
        masyanya.say();

        Wolf wolf = new Wolf(7, 35, Animal.Color.GRAY,true);
        wolf.say();

        Lion lion = new Lion(5,90, Animal.Color.YELLOW,true);
        lion.say();

        Fish fish = new Fish(1,1, Animal.Color.BLUE);
        fish.say();

    }
}
