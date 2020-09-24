package com.company.z2;

public class ChowChow extends Dog{
    public ChowChow(int size, String colour, int age) {
        super(size, colour, age);
    }
    public void print() {
        System.out.println("ChowChow: size: " + size + " colour: " + colour + " age: " + age);
    }
}
