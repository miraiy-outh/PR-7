package com.company.z1;

abstract public class Dish {
    String colour;
    int number;

    public Dish(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }

    abstract public String toString();
}
