package com.bridgelabz.problems;
public class CardQueue {

    Node front, rear;

    public void enqueue(Card card) {
        Node newNode = new Node(card);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public Card dequeue() {
        if (front == null) return null;
        Card card = front.card;
        front = front.next;
        if (front == null) rear = null;
        return card;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Sorting cards by rank (simple bubble sort logic)
    public void sort() {
        if (front == null) return;

        for (Node i = front; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.card.rankValue > j.card.rankValue) {
                    Card temp = i.card;
                    i.card = j.card;
                    j.card = temp;
                }
            }
        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.card);
            temp = temp.next;
        }
    }
}
