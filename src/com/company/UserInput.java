package com.company;


import java.util.Scanner;

public class UserInput {

    public Worker populateWorker(){

        Worker worker = new Worker();

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj imie pracownika: ");
        worker.name = in.nextLine(); //dodajemy imie

        System.out.println("Podaj imie nazwisko: ");
        worker.lastName = in.nextLine(); //dodajemy nazwisko

        System.out.println("Podaj płeć pracownika: ");
        worker.gender = in.nextLine(); //dodajemy płeć

        System.out.println("Podaj dział w którym pracuje pracownik: ");
        worker.section = in.nextInt(); //dodajemy dział

        System.out.println("Podaj ilość dzieci pracownika: ");
        worker.kids = in.nextInt(); //dodajemy dzieci

        System.out.println("Podaj stan cywilny pracownika: ");
        worker.status = in.nextBoolean(); //dodajemy imie

        return worker;
    }



}
