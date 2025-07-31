package org.example.playingPiece;

import lombok.Getter;
import org.example.model.PlayingPieceType;
import org.example.model.Team;

@Getter
public abstract class PlayingPiece {
    PlayingPieceType type;
    Team team;
    String theme;

    public boolean isValid(int initialRow, int initialCol, int finalRow, int finalCol, PlayingPiece[][] state) {
        if(state[finalRow][finalCol]!=null && state[finalRow][finalCol].getTeam() == team) {
            return false;
        }
        return isValidMove(initialRow, initialCol, finalRow, finalCol, state);
        /* TODO: check if the playing piece is moving over another playing piece
        if(type!=PlayingPieceType.KNIGHT) {
            if(initialRow-finalRow==0) {
                int min=Math.min(initialCol, finalCol)+1;
                int max=Math.max(initialCol, finalCol);
                for(int i=min;i<max;i++) {
                    if(state[initialRow][i]!=null) {
                        return false;
                    }
                }
            } else if(initialCol-finalCol==0) {
                int min=Math.min(initialRow, finalRow)+1;
                int max=Math.max(initialRow, finalRow);
                for(int i=min;i<max;i++) {
                    if(state[i][initialCol]!=null) {
                        return false;
                    }
                }
            } else {
                int minRow = Math.min(initialRow, finalRow)+1;
                int maxRow=Math.max(initialRow, finalRow);
                int
            }
        }*/
    }

    protected abstract boolean isValidMove(int initialRow, int initialCol, int finalRow, int finalCol, PlayingPiece[][] state);
}
