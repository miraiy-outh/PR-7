package com.company.z3;

public class Lamp extends Furniture {
    int numberLightBulbs;

    public Lamp(String colour, int numberLightBulbs) {
        super(colour);
        this.numberLightBulbs = numberLightBulbs;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "numberLightBulbs=" + numberLightBulbs +
                ", colour=" + colour +
                '}';
    }
}
