package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;

        Controller controller = new Controller();
        Scanner put = new Scanner(System.in);
        while (flag) {
            System.out.println("Witaj w systemie!!!\nWybierz działanie które chcesz wykonać:\n" +
                    "1. Dodaj nowego pracownika." +
                    "\n2. ");

            String  option = put.nextLine();
            switch (option) {
                case "1":
                    controller.addWorker();
                    break;

            }
        }
    }
}