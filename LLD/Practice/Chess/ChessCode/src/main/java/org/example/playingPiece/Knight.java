package org.example.playingPiece;

import org.example.model.PlayingPieceType;
import org.example.model.Team;

public class Knight extends PlayingPiece{

    public Knight(Team team) {
        this.team = team;
        this.type = PlayingPieceType.KNIGHT;
    }

    @Override
    protected boolean isValidMove(int initialX, int initialY, int finalX, int finalY, PlayingPiece[][] state) {
        int diffRow = Math.abs(initialX - finalX);
        int diffCol = Math.abs(initialY - finalY);
        return (diffCol==1 && diffRow==2) || (diffCol==2 && diffRow==1);
    }
}
