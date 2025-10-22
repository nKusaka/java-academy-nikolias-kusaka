package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private int playerNumber;

    public Hand(int playerNumber) {
        cards = new ArrayList<>();
        this.playerNumber = playerNumber;
    }

    public void deal(Card card) {
        cards.add(card);
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public int getSize() {
        return cards.size();
    }

    public int getValue() {
        int value = 0;
        boolean isAce = false;
        boolean aceCheck = false;
        for (Card cardInHand: cards) {
            cardInHand.flip();

            if (cardInHand.getPointValue() == 11) {
                isAce = true;
            }

            value += cardInHand.getPointValue();
        }

        if (isAce && value > 21 && !aceCheck) {
            value -= 10;
        }
        aceCheck = true;
        return value;
    }
}
