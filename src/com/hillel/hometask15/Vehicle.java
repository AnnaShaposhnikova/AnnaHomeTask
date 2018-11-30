package com.hillel.hometask15;

public class Vehicle {
    private int speed;
    private Color color;
    private int tonage;
    private String name;




    public Vehicle(int tonage, Color color) {
        this.tonage = tonage;
        this.color = color;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        if (speed > 0){
            System.out.println( name +" is mooving");
        }
        else {
            System.out.println(name +" is not mooving");
        }
    }


}
