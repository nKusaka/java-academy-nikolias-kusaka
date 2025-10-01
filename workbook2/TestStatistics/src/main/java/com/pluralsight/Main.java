package com.pluralsight;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] TestScore = {91, 92, 93, 94, 89, 100, 72, 69, 83, 99};

        Arrays.sort(TestScore);

        System.out.println("The lowest score is: " + TestScore[0]);
        System.out.println("The highest score is: " + TestScore[9]);
    }
}