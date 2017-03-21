package com.company;

import com.company.Controller.Controller;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        Controller controller = new Controller();
        Scanner put = new Scanner(System.in);
        controller.currentStaff();
        System.out.println("Witaj w Systemie!!!");
        while (flag) {
            System.out.println("Wybierz działanie które chcesz wykonać:" +
                    "\n1. Pokaż listę pracowników." +
                    "\n2. Dodaj nowego pracownika." +
                    "\n3. Importuj dane do pliku notatnika. " +
                    "\n4. Usuń pracownika z listy." +
                    "\n5. Edycja danych pracowników." +
                    "\n6. Dodatkowe funkcje." +
                    "\n7. Dodatkowe opcje zapisu do pliku tekstowego."+
                    "\n8. Informacje o programie."+
                    "\nX. Zakończ działanie programu.");

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
                case "7":
                    System.out.println("Dział w budowie.");
                    break;
                case "8":
                    System.out.println("Nawet średni.");
                    break;
                case "X":
                    exit(0);
                    break;

            }
        }
    }
}