package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if(isFaceUp) {
            return this.suit;
        }
        return "#";
    }

    public String getValue() {
        if(isFaceUp) {
            return this.value;
        }
        return "#";
    }

    public int getPointValue() {
        if(isFaceUp) {
            switch(getValue()){
                case "A":
                    return 11;
                case "K", "Q", "J":
                    return 10;
            }
        }
        return Integer.parseInt(getValue());
    }

    public boolean isFaceUp() {
        return this.isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
