package org.example;

import org.example.command.*;
import org.example.invoker.Invoker;
import org.example.taxopark.Taxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Taxi> taxis = new ArrayList<>();
        Invoker invoker = new Invoker();
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.next();
            switch (s){
                case "/add":
                    invoker.executeOperation(new addCom(taxis));
                    break;
                case "/print":
                    invoker.executeOperation(new printCom(taxis));
                    break;
                case"/fullcost":
                    invoker.executeOperation(new fullcostCom(taxis));
                    break;
                case "/find":
                    invoker.executeOperation(new findCom(taxis));
                    break;
                case "/exit":
                    break;
                case "/sort":
                    invoker.executeOperation((new sortCom(taxis)));
                    break;
                default:
                    System.out.println("Неправильна команда");
                    break;
            }
        }while (!s.equals("/exit"));
    }
}