package com.hillel.hometask16;

public class Employee {
    public enum Gender { MALE, FEMALE};

    private String name;
    private int year;
    private double salary;
    private Gender gender;


    public Employee(String name, int year, double salary, Gender gender) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }



    public void printInfo() {
            System.out.println("Name is: " + name);
            System.out.println("Year is: " + year);
            System.out.println("Salary is: " + salary);
            System.out.println("Gender is: " + gender);
            System.out.println();

    }
    @Override
    public boolean equals (Object obj){
        Employee incomeEmployee = (Employee)obj;
        boolean comparedGender = this.gender.equals(incomeEmployee.gender);
        if (comparedGender){
            return true;
        }
        return false;
    }

}


