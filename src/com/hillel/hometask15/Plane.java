package com.hillel.hometask15;

public class Plane extends Vehicle{
   private int maxNumPlaces;
   private int currentNumPlaces;

    public Plane(int tonage, Color color, int maxNumPlaces) {
        super(tonage, color);
        this.maxNumPlaces = maxNumPlaces;
        setName("Plane");
    }

    public void fly (){
        setSpeed(900);
        move();

    }



    public void bookTicket (int numBookingPlases) {

        int freePlases = maxNumPlaces - currentNumPlaces;

        if (freePlases >= numBookingPlases) {

            currentNumPlaces = currentNumPlaces + numBookingPlases;
            System.out.println("You booked " + numBookingPlases + " places");
        } else if (freePlases < numBookingPlases) {
            int ticketBalance = maxNumPlaces - currentNumPlaces;

            System.out.println("You can book " + ticketBalance + " places");

        }

    }
}
