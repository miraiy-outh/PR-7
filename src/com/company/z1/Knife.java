package com.company.z1;

public class Knife extends Dish {
    int length;

    public Knife(String colour, int number, int length) {
        super(colour, number);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Knife{" +
                "length=" + length +
                ", colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
