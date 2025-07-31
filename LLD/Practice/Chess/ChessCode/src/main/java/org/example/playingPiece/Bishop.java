package org.example.playingPiece;

import org.example.model.PlayingPieceType;
import org.example.model.Team;

public class Bishop extends PlayingPiece{

    public Bishop(Team team) {
        this.team = team;
        this.type = PlayingPieceType.BISHOP;
    }

    @Override
    protected boolean isValidMove(int initialX, int initialY, int finalX, int finalY, PlayingPiece[][] state) {
        return Math.abs(initialX - finalX) == Math.abs(initialY - finalY);
    }
}
