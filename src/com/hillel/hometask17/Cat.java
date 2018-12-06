package com.hillel.hometask17;

public class Cat extends Animal {

    private String name;

    public Cat(int age, double weight, Color color, String name) {
        super(age, weight, color);
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Hello, my name is " + name + "! Meow!!!");
    }
}
