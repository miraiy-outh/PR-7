package com.company.z2;

public class Main {
    public static void main(String[] args) {
        Akita a1 = new Akita(200, "orange", 1);
        ChowChow c1 = new ChowChow(50, "black", 5);
        Pug p1 = new Pug(70, "grey", 3);
        a1.print();
        c1.print();
        p1.print();
    }
}
