package org.example.user;

import org.example.model.Team;
import org.example.playingPiece.PlayingPiece;

import java.util.ArrayList;
import java.util.List;

public class Player extends User{

    Team team;
    public List<PlayingPiece> playingPieces;

    public Player(Team team, String name) {
        this.team = team;
        playingPieces = new ArrayList<>();
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }
}
