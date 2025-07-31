package org.example;

import org.example.model.PlayingPiece;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game started");
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Ritu", PlayingPiece.X));
        players.add(new Player(1, "Piu", PlayingPiece.O));
        GameManager gameManager = new GameManager(3, players);
        gameManager.startGame();
    }
}