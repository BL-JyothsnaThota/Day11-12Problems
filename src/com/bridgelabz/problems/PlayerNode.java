package com.bridgelabz.problems;
class PlayerNode {
    Player player;
    PlayerNode next;

    PlayerNode(Player player) {
        this.player = player;
    }
}

class PlayerQueue {
    PlayerNode front, rear;

    void enqueue(Player player) {
        PlayerNode node = new PlayerNode(player);
        if (rear == null) {
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    void displayPlayers() {
        PlayerNode temp = front;
        while (temp != null) {
            temp.player.showCards();
            temp = temp.next;
        }
    }
}
