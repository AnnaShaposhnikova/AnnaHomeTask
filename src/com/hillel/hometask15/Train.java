package com.hillel.hometask15;

public class Train extends Vehicle {

    private int maxNumRailwayCarriage;

    public Train(int tonage, Color color, int maxNumRailwayCarriage) {
        super(tonage, color);
        this.maxNumRailwayCarriage = maxNumRailwayCarriage;
        setName("Train");
    }

    public void changeColor(){
        if (getColor() == Color.green){
            setColor(Color.red);
            System.out.println("Train color is red");
        }
        else {
            setColor(Color.dotted);
            System.out.println("Train color is dotted");
        }

    }
}
