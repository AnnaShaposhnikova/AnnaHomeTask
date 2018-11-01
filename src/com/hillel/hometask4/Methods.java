package com.hillel.hometask4;

public class Methods {
    public static double methodCourse (double grn, double course){
        double k = grn*100; // перевод гривны в копейки.
        double dollar = (k / course)/100;
        return  dollar;

    }
    public static int sumOfNumbers (int x){
        double y = x/100;
        int r = x - (int)y *100;
        double z =  r/10;
        int f = r - (int) z*10;
        int result = (int) y + (int)z + f;
        return result;
    }

    public static double perimetr (double h, double w){
        double p = 2*h + 2*w;
        return p;
    }
    public static double square (double h, double w) {
        double s = h*w;
        return s;
    }
    public static boolean ifTrainsCrash (double v1, double v2){
        final int S1=4;
        final int S2=6;
        double t1=S1/v1;
        double t2=S2/v2;

        if (t1<t2){
            return false;   // trans will not crash
        }
        else {
            return true; // trains will crash
        }
    }

    public static void quadraticEquation (double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("First root of equation x1= " + x1);
            System.out.println("Second root of equation x2= " + x2);

        } else if (d < 0) {
            System.out.println("No Decision");


        } else if (d==0) {
            double x = -b / (2 * a);
            System.out.println("The root of equation x= " + x);
        }

    }
    }