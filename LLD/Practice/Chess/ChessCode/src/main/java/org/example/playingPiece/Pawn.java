package org.example.playingPiece;

import org.example.model.PlayingPieceType;
import org.example.model.Team;

public class Pawn extends PlayingPiece {

    public Pawn(Team team) {
        this.team = team;
        this.type = PlayingPieceType.PAWN;
    }

    @Override
    protected boolean isValidMove(int initialRow, int initialCol, int finalRow, int finalCol, PlayingPiece[][] state) {
        // Assuming white is on side 1 & black on side 8
        // cannot move backwards
        if((team==Team.BLACK && initialRow<=finalRow) || (team==Team.WHITE && initialRow>=finalRow)) {
            return false;
        }

        // attack
        if(initialCol!=finalCol) {
            return Math.abs(initialCol-finalCol)==1 && Math.abs(initialRow-finalRow)==1 && state[finalRow][finalCol]!=null;
        }

        if(Math.abs(initialRow-finalRow)>2) return false;

        // case when it moves 2 places.
        if(Math.abs(initialRow-finalRow)==2)
        {
            if(!((team==Team.BLACK&&initialRow==6) || (team==Team.WHITE&&initialRow==1))) return false;
        }
        return state[finalRow][finalCol]==null;
    }
}
