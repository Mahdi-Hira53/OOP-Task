package hira;

public class Student {

    String name;    //Instance variable
    int id;         //Instance variable
    static String universityName = "Leading University,Sylhet";   //Class variable

    Student()   //Default Constructor
    {

    }

    Student(String name)    //Parameterize Constructor
    {
        this.name = name;   //Variable hiding
        System.out.println("Name: "+name);
    }

    Student(int id)    //Parameterize Constructor
    {
        this.id = id;       //Variable hiding
        System.out.println("ID: "+id);
    }

    void display()     //Method
    {
        System.out.println("University: "+universityName);
    }
}

/*
  Name: Md. Mahdi Hossain Hira
  ID: 2012020106
  Section: C
  Email: cse_2012020106@lus.ac.bd
  Date: 06-08-2021
 */