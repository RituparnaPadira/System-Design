package org.example;

import org.example.model.Team;
import org.example.user.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Player> players = new ArrayList<>();
        players.add(new Player(Team.WHITE, "Ritu"));
        players.add(new Player(Team.BLACK, "Piu"));
        GameManager manager = new GameManager(players, new ArrayList<>(), "WorldCup");
        manager.startGame();
    }
}