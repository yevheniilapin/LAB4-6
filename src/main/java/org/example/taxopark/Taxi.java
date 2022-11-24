package org.example.taxopark;

public class Taxi implements  Comparable<Taxi>{
    private String mark;
    private String model;
    private String color;
    private int speed;
    private int cost;
    private int weight;
    private int FuelPerKm;
    private int FuelCap;

    public String getModel() {
        return model;
    }
    public String getMark() {
        return mark;
    }
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public int getCost() {
        return cost;
    }
    public int getWeight() {
        return weight;
    }
    public int getFuelPerKm() {
        return FuelPerKm;
    }
    public int getFuelCap() {
        return FuelCap;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuelPerKm(int fuelPerKm) {
        FuelPerKm = fuelPerKm;
    }
    public void setFuelCap(int fuelCap) {
        FuelCap = fuelCap;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +"км/год"+
                ", cost=" + cost +
                ", weight=" + weight +"т"+
                ", FuelPerKm=" + FuelPerKm +
                ", FuelCap=" + FuelCap+"л ";
    }

    @Override
    public int compareTo(Taxi o) {
        return this.FuelPerKm-o.FuelPerKm;
    }
}
