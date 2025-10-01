package com.pluralsight;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] TestScore = {91, 92, 93, 94, 89, 100, 72, 69, 83, 99};
        int average = 0;

        Arrays.sort(TestScore);

        for (int scores: TestScore) {
            average += scores;
        }

        average /= 10;

        System.out.println("The average score is: " + average);
        System.out.println("The lowest score is: " + TestScore[0]);
        System.out.println("The highest score is: " + TestScore[9]);

        int median = ((TestScore[4] + TestScore[5])) / 2;
        System.out.println(median);
        System.out.println(average);
        double difference = average - median;

        System.out.println("The difference between the average and the median is : " + Math.abs(difference));
    }
}