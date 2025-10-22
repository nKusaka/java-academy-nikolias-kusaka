package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        Scanner read = new Scanner(System.in);
        boolean playerChoice = true;
        int[] losers;
        int loserCounter = 0;
        int counter = 1;


        deck.shuffle();

        System.out.printf("how many players are there: ");
        int userInput = read.nextInt();
        read.nextLine();

        ArrayList<Hand> players = new ArrayList<Hand>();
        losers = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            players.add(new Hand());
        }

        for (Hand player: players) {
            while (player.getSize() < 2){
                Card card = deck.deal();
                player.deal(card);
            }
        }

        while (dealer.getSize() < 2) {
            Card card = deck.deal();
            dealer.deal(card);
        }

        for (int i = 0; i < players.size(); i++) {
            while (playerChoice && players.get(i).getValue() < 21) {
                System.out.println("Player " + counter + " total: " + players.get(i).getValue());
                System.out.printf("Would you like another card? 1 for yes 0 for no ");
                int userChoice = read.nextInt();
                read.nextLine();


                if (players.get(i).getValue() >= 21 || userChoice == 0) {
                    playerChoice = false;
                } else {
                    Card card = deck.deal();
                    players.get(i).deal(card);
                }

                if (players.get(i).getValue() > 21) {
                    System.out.println("Player " + counter + " busted out");
                    losers[i] = loserCounter;

                }
            }

            loserCounter++;
            counter++;
            playerChoice = true;
        }

        for (int loser: losers) {
            players.remove(loser);
        }
        counter = 1;


        while (dealer.getValue() <= 16 && players.isEmpty()) {
            System.out.println("Dealer taking cards: " + dealer.getValue());
            Card card = deck.deal();
            dealer.deal(card);
            Thread.sleep(500);
        }

        if (dealer.getValue() > 21) {
            System.out.println("Dealer total: " + dealer.getValue());
            System.out.println("Dealer busts all remaining players win");
            return;
        }

        System.out.println("Dealer total: " + dealer.getValue());
        for (Hand player: players) {
            if (player.getValue() > dealer.getValue()) {
                System.out.println("Player " + counter + " wins!");
            } else {
                System.out.println("Player " + counter + " loses!");
            }
            counter ++;
        }

        if (players.isEmpty()) {
            System.out.println("Dealer wins");
        }
    }
}
