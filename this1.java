package com.company;

class testThis{
    int id;
    String name;
    float _salary;

    //creating a parametrized constructor
    testThis(int id, String name, float _salary){
        this.id=id;
        this.name=name;
        this._salary=_salary;
    }


    //create a method to display
    public void display(){
        System.out.println("Id is : "+id);
        System.out.println("Name is :"+name);
        System.out.println("Salary is : "+_salary);
    }

}

public class this1 {
    public static void main(String[] args) {
       testThis t1 = new testThis(12,"Ahmer",33000f);
       testThis t2 = new testThis(13,"Ali",40000f);
        //calling a method
        t1.display();
        t2.display();


    }
}
