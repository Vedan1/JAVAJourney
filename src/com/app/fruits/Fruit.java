package com.app.fruits;
public class Fruit {

    private  String color;
    private double weight;
    private String name;
    private boolean fresh ;


    public Fruit(String color, double weight, String name, boolean fresh) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.fresh = fresh;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return fresh;
    }

    public double getWeight() {
        return weight;
    }
}

