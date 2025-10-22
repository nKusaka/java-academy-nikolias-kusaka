package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        Scanner read = new Scanner(System.in);
        boolean playerChoice = true;
        boolean[] wins;
        int counter = 1;


        deck.shuffle();

        System.out.printf("how many players are there: ");
        int userInput = read.nextInt();
        read.nextLine();

        Hand[] players = new Hand[userInput];
        wins = new boolean[userInput];

        for (int i = 0; i < userInput; i++) {
            players[i] = new Hand();
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

        for (int i = 0; i < players.length; i++) {
            while (playerChoice && players[i].getValue() < 21) {
                System.out.println("Player " + counter + " total: " + players[i].getValue());
                System.out.printf("Would you like another card? 1 for yes 0 for no ");
                int userChoice = read.nextInt();
                read.nextLine();


                if (players[i].getValue() >= 21 || userChoice == 0) {
                    playerChoice = false;
                } else {
                    Card card = deck.deal();
                    players[i].deal(card);
                }
                System.out.println("Player " + counter + " total: " + players[i].getValue());

                if (players[i].getValue() > 21) {
                    wins[i] = false;
                    System.out.println("Player " + counter + " busted out");
                }
            }

            counter++;
            playerChoice = true;
        }

        counter = 1;


        while (dealer.getValue() <= 16) {
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
            if (player.getValue() > dealer.getValue() && player.getValue() <= 21) {
                System.out.println("Player " + counter + " wins!");
            } else {
                System.out.println("Player " + counter + " loses!");
            }
            counter ++;
        }
    }
}
