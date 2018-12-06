package com.hillel.hometask17;

public abstract class Animal {
    public enum Color {RED, BLACk, WHITE, BLUE, GREEN, YELLOW, GRAY};

    private int age;
    private double weight;
    private Color color;

    public Animal(int age, double weight, Color color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }


    public abstract void say ();

    public void eat (){
        System.out.println("Animal is eating");
    }
    public void sleep (){
        System.out.println("Animal is sleeping");
    }


}
