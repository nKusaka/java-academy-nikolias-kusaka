package com.pluralsight;

import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> cards;

    public Dealer() {
        cards = new ArrayList<>();
    }

    public void deal(Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    public int getValue() {
        int value = 0;
        boolean isAce = false;

        for (Card cardInHand: cards) {
            cardInHand.flip();

            if (cardInHand.getPointValue() == 11) {
                isAce = true;
            }

            value += cardInHand.getPointValue();
        }

        if (isAce && value > 21) {
            value -= 10;
        }
        return value;
    }
}
