package com.company.Model;

public class Worker {

    private String name;
    private String lastName;
    private char gender;
    private int section;
    private float salary;
    private int age;
    private int kids;
    private boolean status;  // true = 1 = zajęty

    public Worker() {

    }


    public Worker(String name, String lastName,
                  char gender, int section, float salary,
                  int age, int kids, boolean status) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.section = section;
        this.salary = salary;
        this.age = age;
        this.kids = kids;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public int getSection() {
        return section;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getKids() {
        return kids;
    }

    public boolean isStatus() {
        return status;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pracownik " +
                "Imie: " + name +
                ", Nazwisko: " + lastName +
                ", Płeć: " + gender +
                ", Dział: " + section +
                ", Wypłata: " + salary +
                ", Wiek: " + age +
                ", Ilość dzieci: " + kids +
                ", Stan Cywilny: " + status +
                " .";
    }

    public String toStringAsFile() {
        return lastName +" "+ name+" "+ section  +
              " "+  salary + " "+ age +" " +kids ;

    }
}
