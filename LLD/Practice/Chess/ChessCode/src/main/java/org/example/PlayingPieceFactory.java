package org.example;

import org.example.model.PlayingPieceType;
import org.example.model.Team;
import org.example.playingPiece.*;

public class PlayingPieceFactory {

    public PlayingPiece getPlayingPiece(PlayingPieceType type, Team team) throws Exception {
        if(type == PlayingPieceType.KING) {
            return new King(team);
        }
        if(type == PlayingPieceType.QUEEN) {
            return new Queen(team);
        }
        if(type == PlayingPieceType.KNIGHT) {
            return new Knight(team);
        }
        if(type == PlayingPieceType.ROOK) {
            return new Rook(team);
        }
        if(type == PlayingPieceType.BISHOP) {
            return new Bishop(team);
        }
        if(type == PlayingPieceType.PAWN) {
            return new Pawn(team);
        }
        throw new Exception("Invalid piece type");
    }

}
