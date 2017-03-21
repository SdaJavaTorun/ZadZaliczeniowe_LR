package com.company.Controller;

import com.company.Model.Worker;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public List<Worker> workerList = new ArrayList<>();

    public void currentStaff() {
        Worker worker1 = new Worker("Ewa",
                "Rybicka", 'K',
                1, 2500, 22, 0, true);
        workerList.add(worker1);

        Worker worker2 = new Worker("Paweł",
                "Piekarski", 'M',
                1, 1500, 28, 2, false);
        workerList.add(worker2);

        Worker worker3 = new Worker("Janusz",
                "Biznesu", 'M',
                1, 3500, 58, 0, false);
        workerList.add(worker3);

        Worker worker4 = new Worker("Jan",
                "Biznesowy", 'M',
                1, 4500, 35, 7, true);
        workerList.add(worker4);

        Worker worker5 = new Worker("Janina",
                "Bizon", 'K',
                0, 4200, 75, 0, false);
        workerList.add(worker5);
    }

    public void addWorker() {

        Worker worker = new Worker();

        Scanner in = new Scanner(System.in);

        System.out.println("Wczytujemy dane!!!\nPodaj imie pracownika: ");
        worker.setName(in.nextLine()); //dodajemy imie

        System.out.println("Podaj imie nazwisko: ");
        worker.setLastName(in.nextLine()); //dodajemy nazwisko

        System.out.println("Podaj płeć pracownika M/K: ");
        Scanner reader = new Scanner(System.in);
        worker.setGender(in.nextLine().charAt(0)); //dodajemy płeć


        System.out.println("Podaj dział w którym pracuje pracownik: ");
        worker.setSection(in.nextInt()); //dodajemy dział

        System.out.println("Podaj ilość dzieci pracownika: ");
        worker.setKids(in.nextInt()); //dodajemy dzieci

        System.out.println("Podaj stan cywilny pracownika: ");
        worker.setStatus(in.nextBoolean()); //dodajemy imie

        System.out.println("Podaj wysokośc wypłaty pracownika: ");
        worker.setSalary(in.nextFloat()); //dodajemy imie

        System.out.println("Podaj wiek pracownika: ");
        worker.setAge(in.nextInt()); //dodajemy imie

        workerList.add(worker);
    }

    public void showList() {
        if (workerList.isEmpty()) {
            System.out.println("Lista jest pusta!!!");
        } else {
            int i = 0;
            for (Worker w : workerList) {
                System.out.println(i + ". " + w.toString());
                i++;
            }
        }
    }

    public void makeFile() {
        String fileName = "c://Users//lukasz//Desktop//Dane_Personalne.txt";
        try {
            FileWriter writ = new FileWriter(fileName, false);

            PrintWriter printWriter = new PrintWriter(writ);
            for (Worker f : workerList) {
                printWriter.println(f.toStringAsFile() + "\n");
            }
            printWriter.close();
        } catch (FileNotFoundException err) {
            err.printStackTrace();
        } catch (IOException err) {
            err.printStackTrace();
        }
        // exit(0);
    }

    public void removeWorker() {
        showList();
        System.out.println("Podaj numer pracownika do usunięcie:");
        Scanner inner = new Scanner(System.in);
        int R = inner.nextInt();

        workerList.remove(R);

    }

    public List<Worker> getWorker() {
        return workerList;
    }

    public void editWorker() {
        showList();

        System.out.println("\nPodaj numer pracownika do edycji:");

        Scanner inner = new Scanner(System.in);
        int q = inner.nextInt();

        boolean flag = true;
        while (flag) {
            System.out.println(getWorker().get(q).toString());

            System.out.println("Podaj co chcesz zmienić:" +
                    "\n a. Nazwisko.\n b. Dział.\n c. Wypłata." +
                    "\n d. Wiek.\n e. Ilość dzieci.\n f. Stan cywilny.\n X. Zakończ edycje.");
            Scanner put5 = new Scanner(System.in);
            String option = put5.nextLine();

            switch (option) {
                case "a":
                    if (getWorker().get(q).getGender() == 'K') {
                        System.out.println("Podaj Nazwisko pracownika: ");
                        Scanner w = new Scanner(System.in);
                        getWorker().get(q).setLastName(w.nextLine());
                    }
                    if (getWorker().get(q).getGender() != 'K') {
                        System.out.println("Brak możliwości zmniany nazwiska.");
                    }
                    break;
                case "b":
                    System.out.println("Podaj dział w którym będzie pracował pracownik: ");
                    Scanner z = new Scanner(System.in);
                    getWorker().get(q).setSection(z.nextInt());
                    break;
                case "c":
                    System.out.println("Podaj wysokośc wypłaty pracownika: ");
                    Scanner b = new Scanner(System.in);
                    getWorker().get(q).setSalary(b.nextFloat());
                    break;
                case "d":
                    System.out.println("Podaj wiek pracownika: ");
                    Scanner v = new Scanner(System.in);
                    getWorker().get(q).setAge(v.nextInt());
                    break;
                case "e":
                    System.out.println("Podaj ilość dzieci pracownika: ");
                    Scanner x = new Scanner(System.in);
                    getWorker().get(q).setKids(x.nextInt());
                    break;
                case "f":
                    System.out.println("Podaj stan cywilny pracownika: ");
                    Scanner c = new Scanner(System.in);
                    getWorker().get(q).setStatus(c.nextBoolean());
                    break;
                case "X":
                    System.out.println("Kończymy edycje");
                    System.out.println(getWorker().get(q).toString());
                    flag = false;
                    break;
            }
        }
    }

    public void evenMoreFunction() {

        boolean flag1 = true;

        while (flag1) {

            System.out.println("\nDodatkowe funkcje programu:" +
                    "\n6a. Oblicznanie ilości pracowników z pensją " +
                    "nie mniejszą niż podana" +
                    "\n6b. Obliczanie średniej płacy w dziale." +
                    "\n6c. Największa wypłata wśród kobiet i mężczyzn." +
                    "\n6d. Rozkład płci w działach." +
                    "\n6e. Srednia wypłat kobiet i mężczyzn, oraz stosunek średnich wypłat." +
                    "\n6f. Podwyższenie wszystkich wypłat o 10%." +
                    "\nX Koniec wprowadzania dodatkowych funkcji.");
            Scanner in = new Scanner(System.in);
            String Option2 = in.nextLine();

            switch (Option2) {

                case "6a":
                    System.out.println("Podaj wysokość wynagrodzenia:");
                    Scanner a = new Scanner(System.in);
                    float money = a.nextFloat();
                    int liczba = 0;
                    for (Worker w : workerList) {
                        if (w.getSalary() < money) {
                            System.out.print(w.getLastName() + " ");
                            liczba++;
                        }
                    }
                    System.out.println("\n" + liczba + " pracowników zarabia mniej niz: " + money);
                    break;

                case "6b":
                    System.out.println("Podaj numer działu w którym chcesz sprawdzić średnią:");
                    Scanner kin = new Scanner(System.in);
                    int Section = kin.nextInt();
                    float summaryOfSalary = 0;
                    float amountOfWorkers = 0;
                    for (Worker v : workerList) {
                        if (v.getSection() == Section) {
                            summaryOfSalary = summaryOfSalary + v.getSalary();
                            amountOfWorkers++;
                        }
                    }
                    float average = summaryOfSalary / amountOfWorkers;
                    System.out.println("Srednie wynagrodzenie w dziale: " + Section + " równa się: " + average + " złotych");
                    break;

                case "6c":
                    System.out.println("Podaje wypłaty wśród kobiet w firmie: ");
                    //wyswietlam wszystkie kobity
                    for (Worker w : workerList) {
                        if (w.getGender() == 'K') {
                            System.out.println("Pani: " + w.getName() + " zarabia: " + w.getSalary() + " złotych.");
                        }
                    }
                    //wyświtlam najwięcej zarabiającą
                    float maxSalaryWoman = getWorker().get(1).getSalary();
                    for (Worker k : workerList) {
                        if (k.getGender() == 'K') {
                            //    float    maxSalaryWoman = getWorker(1).getSalary();
                            if (k.getSalary() >= maxSalaryWoman) {
                                maxSalaryWoman = k.getSalary();
                            }
                        }
                    }
                    System.out.println("Największa pensja wśród kobiet to: " + maxSalaryWoman + " złotych.\n");
                    //teraz faceci
                    System.out.println("Podaje wypłaty wśród mężczyzn w firmie: ");
                    //wyswietlam wszystkie kobity
                    for (Worker w : workerList) {
                        if (w.getGender() == 'M') {
                            System.out.println("Pan: " + w.getName() + " zarabia: " + w.getSalary() + " złotych.");
                        }
                    }
                    //wyświtlam najwięcej zarabiających
                    float maxSalaryMan = getWorker().get(1).getSalary();
                    for (Worker k : workerList) {
                        if (k.getGender() == 'M') {
                            if (k.getSalary() >= maxSalaryMan) {
                                maxSalaryMan = k.getSalary();
                            }
                        }
                    }
                    System.out.println("Największa pensja wśród mężczyzn to: " + maxSalaryMan + " złotych.\n");
                    break;

                case "6d":
                    System.out.println("Dział w budowie!!!");
                    break;

                case "6e": //średnie pensje faceci
                    float summaryOfManSalary = 0;
                    float amountOfManWorkers = 0;
                    for (Worker m : workerList) {
                        if (m.getGender() == 'M') {
                            summaryOfManSalary = summaryOfManSalary + m.getSalary();
                            amountOfManWorkers++;
                        }
                    }
                    float averageManSalary = summaryOfManSalary / amountOfManWorkers;
                    System.out.printf("Srednie wynagrodzenie mężczyzn równa się: %5.2f", averageManSalary);
                    System.out.println("");

                    float summaryOfWomanSalary = 0;
                    float amountOfWomanWorkers = 0;
                    for (Worker w : workerList) {
                        if (w.getGender() == 'K') {
                            summaryOfWomanSalary = summaryOfWomanSalary + w.getSalary();
                            amountOfWomanWorkers++;
                        }
                    }
                    float averageWomanSalary = summaryOfWomanSalary / amountOfWomanWorkers;
                    System.out.printf("Srednie wynagrodzenie kobiet równa się: %5.2f", averageWomanSalary);
                    System.out.println("");
                    System.out.printf("Srednia płaca kobiet w stosunku do średniej płacy mężczyzn równa się: %5.2f", averageWomanSalary / averageManSalary);
                    break;

                case "6f": //zwiększanie pensji wszystkim
                    System.out.println("Zwiąkszamy pensje wszystkim pracownikom.");
                    showList();
                    for (int p = 0; p < workerList.size(); p++) {
                        float newSalary = 11 * getWorker().get(p).getSalary() / 10;
                        getWorker().get(p).setSalary(newSalary);
                    }
                    System.out.println("Podwyżka!!!");
                    showList();


                    break;
                case "X":
                    flag1 = false;
            }
        }
    }







}



