package com.company.z3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String want1;
        Cupboard c1 = new Cupboard("orange", 150, 50, 200);
        Lamp l1 = new Lamp("white", 5);
        Table t1 = new Table("black", 100, "wood");
        FurnitureShop f1 = new FurnitureShop(c1, l1, t1);
        f1.have();
        want1 = scan.next();
        f1.want(want1);
    }
}
