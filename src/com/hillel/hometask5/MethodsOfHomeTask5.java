package com.hillel.hometask5;

public class MethodsOfHomeTask5 {
    public static void seasonFirstVariant (int month){
        if ((month==1)||(month==2)||(month==12)){
            System.out.println("Winter");
        }
        else if ((month==3)||(month==4)||(month==5)){
            System.out.println("Spring");
        }
        else if ((month==6)||(month==7)||(month==8)){
            System.out.println("Summer");
        }
        else if ((month==9)||(month==10)||(month==11)){
            System.out.println("Autumn");
        }
        else {
            System.out.println("Unknown season");}
    }
    public static void seasonSecondVariant (int month){
        switch (month){

            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
                default:
                    System.out.println("Unknown season");
        }
    }
    public static long bitDivFour (double number){
        long x= (int)number>>2;
        return  x;
    }

}
