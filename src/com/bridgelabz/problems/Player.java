package com.bridgelabz.problems;
public class Player {
    String name;
    CardQueue cards = new CardQueue();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        cards.enqueue(card);
    }

    public void sortCards() {
        cards.sort();
    }

    public void showCards() {
        System.out.println(name + " Cards:");
        cards.display();
        System.out.println();
    }
}
