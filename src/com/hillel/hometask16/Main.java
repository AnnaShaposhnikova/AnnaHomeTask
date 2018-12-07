package com.hillel.hometask16;

public class Main {
    public static void main(String[] args) {

        ManagmentDepartment m1 = new ManagmentDepartment();


        m1.add("Ivan Ivanov",1990, 10000D, Employee.Gender.MALE );
        m1.add("Julia Pupkina",1970, 20000D, Employee.Gender.FEMALE );
        m1.add("Fedor Kozulkin", 1987,15000D, Employee.Gender.MALE );
        m1.add("Nadegda Koruavkina", 1980, 25000D, Employee.Gender.FEMALE);
        m1.add("Stepan Smorchkov", 1977,15000D, Employee.Gender.MALE);
        m1.add("Natalua Zababashkina", 1975, 18000D, Employee.Gender.FEMALE);
        m1.add("Peter Korytov",1965, 22000D, Employee.Gender.MALE);
        m1.add("Taisiya Khromonogina",1983, 17000D, Employee.Gender.FEMALE);
        m1.add("Nikolay Kosorukov", 1989,21000D, Employee.Gender.MALE);

        m1.showAllEmploee();
        System.out.println("FEMALE IS:");
        m1.genderFilter(Employee.Gender.FEMALE);
        m1.showGenderFilter();
        System.out.println("Employee older 35 year age:");
        m1.filterOlder(35);
        m1.showOlderFilter();
        System.out.println("Employee younger 30 year age:");
        m1.filterYounger(30);
        m1.showYoungerFilter();

    }
}
