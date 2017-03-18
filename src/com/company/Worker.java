package com.company;

public class Worker {

    public String name;
    public String lastName;
    public String  gender;
    public int section;
    public float salary;
    public int age;
    public int kids;
    public boolean status;  // true = zajęty

    public Worker(){

    }

    public Worker(String name, String lastName, String gender, int section, float salary, int age, int kids, boolean status) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.section = section;
        this.salary = salary;
        this.age = age;
        this.kids = kids;
        this.status = status;
    }
}
