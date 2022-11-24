package org.example.taxopark;

import java.io.*;
import java.util.*;

public class Actions {
    public void add(List<Taxi> taxis){
        Taxi taxi = new Taxi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть марку:");
        taxi.setMark(scanner.nextLine());
        System.out.println("Введіть модель:");
        taxi.setModel(scanner.nextLine());
        System.out.println("Введіть колір:");
        taxi.setColor(scanner.nextLine());
        System.out.println("Введіть швидкість:");
        taxi.setSpeed(scanner.nextInt());
        System.out.println("Введіть ціну:");
        taxi.setCost(scanner.nextInt());
        System.out.println("Введіть вагу:");
        taxi.setWeight(scanner.nextInt());
        System.out.println("Введіть витрату пального на км:");
        taxi.setFuelPerKm(scanner.nextInt());
        System.out.println("Введіть об'єм баку:");
        taxi.setFuelCap(scanner.nextInt());

        taxis.add(taxi);
        System.out.println("Машину успішно додано");
    }
    public void print(List<Taxi> taxis){
        for(Taxi taxi : taxis){
            System.out.println(taxi.toString());
        }
    }
    public void fullcost(List<Taxi> taxis){
        int res = 0;
        for(Taxi taxi:taxis){
            res+=taxi.getCost();
        }
        System.out.println("Вартість таксопарку: "+res);
    }
    public void findspeed(List<Taxi>taxis){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть початок діапазуну: ");
        int a = scanner.nextInt();
        System.out.println("Введіть кінець діапазуну: ");
        int b = scanner.nextInt();
        System.out.println("Автомобілі зі швидкістю у діапазоні "+a+"-"+b);
        for (Taxi taxi : taxis){
            if(taxi.getSpeed()>=a&&taxi.getSpeed()<b){
                System.out.println(taxi.toString());
            }
        }
    }
    public void sort(List<Taxi>taxis){
        Collections.sort(taxis);
        System.out.println("Список відсортовано");
    }
}
