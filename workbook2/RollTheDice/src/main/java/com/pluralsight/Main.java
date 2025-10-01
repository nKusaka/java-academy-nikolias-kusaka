package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RollTheDice diceOne = new RollTheDice();
        RollTheDice diceTwo = new RollTheDice();
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 100; i++) {
            diceOne.roll();
            diceTwo.roll();

            System.out.println("Roll " + (i + 1) + ": " + diceOne.getNumber() + " - " + diceTwo.getNumber() + " Sum: " + (diceOne.getNumber() + diceTwo.getNumber()));
            // Checking for how many times two pops up as a role
            if ((diceOne.getNumber() + diceTwo.getNumber() == 2)) {
                twoCounter += 1;

            } else if (diceOne.getNumber() == 2 && diceTwo.getNumber() == 2) {
                twoCounter += 2;

            } else if (diceOne.getNumber() == 2 || diceTwo.getNumber() == 2) {
                twoCounter += 1;
            }

            // Checking for how many times four pops up as a role
            if ((diceOne.getNumber() + diceTwo.getNumber() == 4)) {
                fourCounter += 1;

            } else if (diceOne.getNumber() == 4 && diceTwo.getNumber() == 4) {
                fourCounter += 2;

            } else if (diceOne.getNumber() == 4 || diceTwo.getNumber() == 4) {
                fourCounter += 1;
            }

            // Checking for how many times six pops up as a role
            if ((diceOne.getNumber() + diceTwo.getNumber() == 6)) {
                sixCounter += 1;

            } else if (diceOne.getNumber() == 6 && diceTwo.getNumber() == 6) {
                sixCounter += 2;

            } else if (diceOne.getNumber() == 6 || diceTwo.getNumber() == 6) {
                sixCounter += 1;
            }

            // Checking for how many times seven pops up as a role
            if ((diceOne.getNumber() + diceTwo.getNumber() == 7)) {
                sevenCounter += 1;
            }
        }
    }
}