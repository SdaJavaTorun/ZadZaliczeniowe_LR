package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Controller {


public UserInput userInput = new UserInput();

public List<Worker> workerList = new ArrayList<>();

public void addWorker(){

    Worker w1 = userInput.populateWorker();
    workerList.add(w1);
}








}
