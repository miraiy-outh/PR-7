package com.company.z1;

public class Main {

    public static void main(String[] args) {
        Cup cup1 = new Cup("pink", 10, 10);
        Knife knife1 = new Knife("grey", 15, 20);
        Plate plate1 = new Plate("white", 20, 30);
        System.out.println(cup1.toString());
        System.out.println(knife1.toString());
        System.out.println(plate1.toString());
    }
}
