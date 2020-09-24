package com.company.z2;

public class Pug extends Dog {
    public Pug(int size, String colour, int age) {
        super(size, colour, age);
    }
    public void print() {
        System.out.println("Pug: size: " + size + " colour: " + colour + " age: " + age);
    }
}
