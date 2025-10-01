package com.pluralsight;

public class Vegeta {
    public static void main(String[] args) {
        Vegeta vegeta = new Vegeta();

        vegeta.powerUp();
        System.out.println(vegeta.finalFlash());
        System.out.println(vegeta.bigBangAttack(10));
    }

    public void powerUp() {
        System.out.println("Vegeta powers up with rage!");
    }

    public String finalFlash() {
        String finalFlash = "BOOOM! Final flash destroys the battlefield!";

        return finalFlash;
    }

    public int bigBangAttack(int ki) {
        int bigBangAttack = ki * 500;

        return bigBangAttack;
    }
}
