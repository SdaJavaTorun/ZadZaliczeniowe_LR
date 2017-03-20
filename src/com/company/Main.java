package com.company;

import com.company.Controller.Controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;

        Controller controller = new Controller();
        Scanner put = new Scanner(System.in);
        controller.currentStaff();
        while (flag) {
            System.out.println("Witaj w systemie!!!" +
                    "\nWybierz działanie które chcesz wykonać:" +
                    "\n1. Pokaż listę pracowników." +
                    "\n2. Dodaj nowego pracownika." +
                    "\n3. Importuj dane do pliku notatnika. " +
                    "\n4. Usuń pracownika z listy." +
                    "\n5. Edycja danych pracowników." +
                    "\n6. Dodatkowe funkcje.");

            String option = put.nextLine();
            switch (option) {

                case "1":

                    controller.showList();
                    break;
                case "2":
                    controller.addWorker();
                    break;
                case "3":
                    controller.makeFile();
                    break;
                case "4":
                    controller.removeWorker();
                    break;
                case "5":
                    controller.editWorker();
                    break;
                case "6":
                    controller.evenMoreFunction();
                    break;

            }
        }
    }
}