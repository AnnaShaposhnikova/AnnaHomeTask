package com.hillel.hometask18;

public class Check {

    private String chackingString;
    private int lengsChackingString;
    private Stack stack;


    public Check(String str) {
        this.chackingString = str;

        this.lengsChackingString = chackingString.length();
        stack = new Stack(chackingString.length());
    }

    public void makeStackAndCheck () {

        for (int i = 0; i < lengsChackingString; i++ ){

            char el = chackingString.charAt( i);



            switch (el) {
                case '(':

                case '[':
                case '{':
                    stack.push(el); // заполнили стек

                    break;
                case ')': // ch
                case ']'://ch

                case '}':// ch


                    char ch = stack.pull();


                    if ((el == ')' && ch != '(') || (el == '}' && ch != '{') || (el == ']' && ch != '[')) {
                        System.out.println("Mistake");
                       return;
                    }
                    break;

            }

        }


        if (stack.pull() == 0){
            System.out.println("Right");
        }
        else {
            System.out.println("Extra bracket");
        }

    }

}