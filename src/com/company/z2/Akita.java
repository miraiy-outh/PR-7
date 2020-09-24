package com.company.z2;

public class Akita extends Dog{
    public Akita(int size, String colour, int age) {
        super(size, colour, age);
    }
    public void print() {
        System.out.println("Akita: size: " + size + " colour: " + colour + " age: " + age);
    }
}
