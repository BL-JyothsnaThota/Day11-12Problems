package com.bridgelabz.problems;
public class Card {
    String suit;
    String rank;
    int rankValue;

    public Card(String suit, String rank, int rankValue) {
        this.suit = suit;
        this.rank = rank;
        this.rankValue = rankValue;
    }

    public String toString() {
        return suit + "-" + rank;
    }
}
