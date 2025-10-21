package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Hand player = new Hand();
        Dealer dealer = new Dealer();

        deck.shuffle();

        while (player.getSize() < 2) {
            Card card = deck.deal();
            player.deal(card);
        }

        while (dealer.getSize() < 2) {
            Card card = deck.deal();
            dealer.deal(card);
        }

        if (dealer.getValue() > player.getValue()) {
            System.out.println("Dealer: " + dealer.getValue() + " Player: " + player.getValue());
            System.out.println("Dealer Wins");
        }
        else if (dealer.getValue() == player.getValue()) {
            System.out.println("Dealer: " + dealer.getValue() + " Player: " + player.getValue());
            System.out.println("Tie");
        } else {
            System.out.println("Dealer: " + dealer.getValue() + " Player: " + player.getValue());
            System.out.println("Player Wins");
        }
    }
}
