package com.bridgelabz.problems;
import java.util.Random;

public class DeckOfCardsOO {

    public static void main(String[] args) {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        int[] rankValues = {2,3,4,5,6,7,8,9,10,11,12,13,14};

        Card[] deck = new Card[52];
        int index = 0;

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                deck[index++] = new Card(suit, ranks[i], rankValues[i]);
            }
        }

        // Shuffle
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = rand.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        // Players Queue
        PlayerQueue playerQueue = new PlayerQueue();

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Player p3 = new Player("Player 3");
        Player p4 = new Player("Player 4");

        playerQueue.enqueue(p1);
        playerQueue.enqueue(p2);
        playerQueue.enqueue(p3);
        playerQueue.enqueue(p4);

        Player[] players = {p1, p2, p3, p4};

        int cardIndex = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                players[j].addCard(deck[cardIndex++]);
            }
        }

        // Sort cards
        for (Player p : players) {
            p.sortCards();
        }

        // Print players and cards
        playerQueue.displayPlayers();
    }
}
