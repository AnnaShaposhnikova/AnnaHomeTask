package com.hillel.hometask18;

public class Stack {

    private final int MAX;

    private char [] stackArray;
    private int pointer = 0;

    public Stack (int capacity){
        this.MAX = capacity;
        stackArray = new char [MAX];
    }

    public void push (char d){
        if (pointer == MAX){
            System.out.println("The stack is full");
            return;
        }
        stackArray[pointer] = d;
        pointer ++;
    }
    public char pull () {
        if (pointer == 0) {
            System.out.println("The stack is empty");
            return 0;

        }
        pointer--;
        char d = stackArray[pointer];
        return d;
    }

    public char peek () {
        if (pointer == 0) {
            System.out.println("Can't peek an element since the stack is empty");
            return 0;
        }

        return stackArray[pointer-1];
    }





}
