package com.hillel.hometask13;

public class Author {
    private String authorName;
    private int birthYear;

    public Author(String authorName, int birthYear) {
        this.authorName = authorName;
        this.birthYear = birthYear;
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals (Object obj){
        Author incomeAuthor = (Author)obj;
        boolean comparedAuthorName = this.authorName.equals(incomeAuthor.authorName);
        boolean comparedBirhtYear = this.birthYear == incomeAuthor.birthYear;

        if(comparedAuthorName && comparedBirhtYear){
            return  true;
        }
        return false;
    }



    public void printInfo(){
        System.out.println("Author is: " + authorName);
        System.out.println("Birth Year is: " + birthYear);
        System.out.println();
    }



}
