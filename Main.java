package com.company;

public class Main {

    public static void main(String[] args) {
	//Data Types
        int a1 = 12;
        float a2 = 23.4f;
        double a3 = 34.444;
        byte a4 = 3;
        System.out.println("value of a1 : "+a1);
        System.out.println("value of a2 : "+a2);
        System.out.println("value of a3 : "+a3);
        System.out.println("value of a4 : "+a4);
        String str1 = "Muhammad Ahmer khan";
        System.out.println("Name is : "+str1);
        char charID = 'X';
        System.out.println("Character is : "+charID);
        System.out.println("------------------------");

        //Operators in Java
        int b1,b2,b3,b4;
        b1=10;
        b2=5;
        System.out.println("Addition is : "+(b1+b2));
        System.out.println("Subtraction is : "+(b1-b2));
        System.out.println("Multiplication is :"+(b1*b2));
        System.out.println("Division is : "+(b1/b2));
        b3=2;
        System.out.println("postfix increment : "+(b3++));
        System.out.println("lets check it again : "+(b3));
        b4=1;
        System.out.println("prefic increment : "+(++b4));
        System.out.println("Lets check it again : "+(b4));
        System.out.println("----------------------");
        //Control Flows statements in java

        //If-Else statement
        int c1 = 10;
        if(c1>11){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
        System.out.println("-----------------");

        //For loop
        int c2  =1;
        for(c2=1;c2<10;c2++){
            System.out.println(c2);
        }
        System.out.println("---------------");

        //While Loop
        int c3=1;
        while(c3<20){
            System.out.println(c3);
            c3++;
        }
        System.out.println("---------------");

        //Do While loop
        int c4=2;
        do{
            System.out.println(c4);
            c4++;
        }while(c4<15);



    }
}
