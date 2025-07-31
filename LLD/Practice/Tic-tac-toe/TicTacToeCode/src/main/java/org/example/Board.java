package org.example;

import org.example.model.PlayingPiece;

public class Board {
    PlayingPiece[][] state;

    public Board(int n) {
        state = new PlayingPiece[n][n];
    }
}
