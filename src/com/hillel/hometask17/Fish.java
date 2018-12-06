package com.hillel.hometask17;

public class Fish extends Animal {

    public Fish(int age, double weight, Color color) {
        super(age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Hello, bul'-bul'");
    }

}
