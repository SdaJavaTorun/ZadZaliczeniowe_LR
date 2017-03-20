package com.company.Controller;

import com.company.Model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondController extends Worker {

    public void averageSalary(int Section) {
        // System.out.println("Podaj numer działu w którym chcesz sprawdzić średnią:");

        // Scanner in = new Scanner(System.in);
        // int section = in.nextInt();
        float summaryOfSalary = 0;
        float amountOfWorkers = 0;

        Controller controller1 = new Controller();
        Worker worker1 = new Worker();


        for (Worker w : controller1.getWorker()) {
            if (w.getSection() == Section) {
                summaryOfSalary = summaryOfSalary + w.getSalary();
                amountOfWorkers++;
                System.out.println(summaryOfSalary);
            }
        }

        float average = summaryOfSalary / amountOfWorkers;
        System.out.printf("Srednie wynagrodzenie w dziale: " + Section + " równa się: %4.3f", average);

    }

}
