package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScore {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Please enter a game score using this as an example (Home:Visitor|21:9)");
        System.out.printf("Your game score: ");
        String Score = read.nextLine();

        String Winner = Winner(Score);

        System.out.println("Winner: " + Winner);

    }

    public static String Winner(String score) {
        String[] teamsAndScores = score.split(Pattern.quote("|"));
        String teams = teamsAndScores[0];
        String scores = teamsAndScores[1];

        String[] splitTeams = teams.split(Pattern.quote(":"));
        String[] splitScores = scores.split(Pattern.quote(":"));
        int scoreOne = Integer.parseInt(splitScores[0]);
        int scoreTwo = Integer.parseInt(splitScores[1]);

        if (scoreOne > scoreTwo) {
            return splitTeams[0];
        } else {
            return splitTeams[1];
        }
    }
}
