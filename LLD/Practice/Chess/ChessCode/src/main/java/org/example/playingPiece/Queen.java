package org.example.playingPiece;

import org.example.model.PlayingPieceType;
import org.example.model.Team;

public class Queen extends PlayingPiece{

    public Queen(Team team) {
        this.team = team;
        this.type = PlayingPieceType.QUEEN;
    }

    @Override
    protected boolean isValidMove(int initialX, int initialY, int finalX, int finalY, PlayingPiece[][] state) {
        return initialY - finalY == 0
                || initialX - finalX == 0
                || Math.abs(initialX - finalX) == Math.abs(initialY - finalY);
    }
}
