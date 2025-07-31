package org.example.playingPiece;

import org.example.model.PlayingPieceType;
import org.example.model.Team;

public class King extends PlayingPiece{

    public King(Team team) {
        this.team = team;
        this.type = PlayingPieceType.KING;
    }

    @Override
    protected boolean isValidMove(int initialX, int initialY, int finalX, int finalY, PlayingPiece[][] state) {
        return Math.abs(initialX - finalX) < 2 && Math.abs(initialY - finalY) < 2;
    }
}
