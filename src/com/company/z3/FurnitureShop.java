package com.company.z3;

public class FurnitureShop {
    Cupboard c;
    Lamp l;
    Table t;

    public FurnitureShop(Cupboard c, Lamp l, Table t) {
        this.c = c;
        this.l = l;
        this.t = t;
    }
    public void have() {
        System.out.println("We Have:");
        System.out.println(c.toString());
        System.out.println(l.toString());
        System.out.println(t.toString());
        System.out.println("What do you want?");
    }
    public void want(String want1) {
        switch (want1) {
            case "cupboard":
                System.out.println("You have:");
                System.out.println(c.toString());
            case "lamp":
                System.out.println("You have:");
                System.out.println(l.toString());
            case "table":
                System.out.println("You have:");
                System.out.println(t.toString());
        }
    }
}
