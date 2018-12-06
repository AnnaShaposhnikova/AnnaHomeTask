package com.hillel.hometask17;

public class Lion extends Animal {

    private boolean isPredator = true;

    public Lion(int age, double weight, Color color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }


    @Override
    public void say() {
        if (isPredator) {
            System.out.println("Hello, i am a wild animal and i am angry");
        }
    }
}
