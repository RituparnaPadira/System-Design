package org.example.playingPiece;

import org.example.model.PlayingPieceType;
import org.example.model.Team;

public class Rook extends PlayingPiece{

    public Rook(Team team) {
        this.team = team;
        this.type = PlayingPieceType.ROOK;
    }

    @Override
    protected boolean isValidMove(int initialX, int initialY, int finalX, int finalY, PlayingPiece[][] state) {
        return (initialX - finalX) == 0 || (initialY - finalY) == 0;
    }
}