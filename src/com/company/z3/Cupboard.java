package com.company.z3;

public class Cupboard extends Furniture {
    int length;
    int width;
    int heigth;

    public Cupboard(String colour, int length, int width, int heigth) {
        super(colour);
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                ", colour=" + colour +
                '}';
    }
}
