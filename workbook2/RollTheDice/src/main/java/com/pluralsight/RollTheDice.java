package com.pluralsight;

// This class will be used to simulate a dice numbered (1-6) like in the real world
public class RollTheDice {

    private int number;

    public  RollTheDice() {
        number = 0;
    }

    public int roll() {
        number = (int)(Math.random() * 6) + 1;
        return number;
    }

    public void setNumber(int number) {
        this.number = number;

    }

    public int getNumber() {
        return this.number;
    }
}
