package com.hillel.hometask14;

public class Godzilla {

    private int volumeStomach = 10; // максимвльный объем
    private int currentVolume = 0;



    public void eatenPeople(int numPerson) {

        int freeSpase = (int)(0.9 * volumeStomach) - currentVolume;

        if (freeSpase >= numPerson){

        currentVolume = currentVolume + numPerson;
        }

        else {
            System.out.println("Too much people");
        }


        if (currentVolume < 0.9 * volumeStomach) {
            System.out.println("Godzilla is  hungry");




        } else {
            System.out.println("Godzilla is not hungry");

        }
    }
}
