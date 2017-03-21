package com.company.Controller;

import com.company.Model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondController extends Controller {

    public void averageSalary(int Section) {

        float summaryOfSalary = 0;
        float amountOfWorkers = 0;

        //Controller controller1 = new Controller();

      //  List<Worker> workerList = new ArrayList<>();

        for (Worker v : this.getWorker()) {

           if (v.getSection() == Section) {
                summaryOfSalary = summaryOfSalary + v.getSalary();
                amountOfWorkers++;
                System.out.println("Działa!!!1");
            }
        }

        float average = summaryOfSalary / amountOfWorkers;
        System.out.printf("Srednie wynagrodzenie w dziale: " + Section + " równa się: %4.3f", average);

    }

}
