package com.hillel.hometask16;

public class ManagmentDepartment {
    private int maxVolumeDepartment = 15;
    private Employee [] managmentDepartment = new Employee[maxVolumeDepartment];
    private Employee[] arrOlder = new Employee[maxVolumeDepartment];
    private Employee [] arrYounger = new Employee[maxVolumeDepartment];
    private Employee [] arrGender = new Employee[maxVolumeDepartment];
    private int currentYear = 2018;


    public void add (String name, int year, double salary, Employee.Gender gender){

        for (int i = 0; i < maxVolumeDepartment; i++) {
            if (managmentDepartment[i] == null) {
                managmentDepartment[i] = new Employee(name, year, salary, gender);
                return;
            }
        }
   }

    public void showAllEmploee(){
        for (Employee element : managmentDepartment){
            if (element != null){
                element.printInfo();

            }
        }
    }


   public Employee [] genderFilter (Employee.Gender gender) {
       int i = 0;
       for (Employee el : managmentDepartment) {

           if (el != null && gender.equals(el.getGender())) {

                   if (arrGender[i] == null) {

                       arrGender[i] = el;
                       i++;

                   }
               }
           }

           return arrGender;


   }


   public Employee [] filterOlder (int age) {
        int i = 0;

       for (Employee el : managmentDepartment){
           if (el != null) {
               int employeeAge = currentYear - el.getYear();
               boolean comparedAge = employeeAge > age;
               if (comparedAge) {
                   arrOlder[i] = el;
                   i++;
               }
           }
       }
       return arrOlder;

   }
    public Employee [] filterYounger (int age) {
        int i = 0;

        for (Employee el : managmentDepartment){
            if (el != null) {
                int employeeAge = currentYear - el.getYear();
                boolean comparedAge = employeeAge < age;
                if (comparedAge) {
                    arrYounger[i] = el;
                    i++;
                }
            }
        }
        return arrYounger;

    }




    public void showGenderFilter(){
        for (Employee element : arrGender){
            if (element != null){
                element.printInfo();

            }
        }
    }
    public void showOlderFilter(){
        for (Employee element : arrOlder){
            if (element != null){
                element.printInfo();

            }
        }
    }
    public void showYoungerFilter(){
        for (Employee element : arrYounger){
            if (element != null){
                element.printInfo();

            }
        }
    }


}



