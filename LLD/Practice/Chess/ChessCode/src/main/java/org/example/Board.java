package org.example;

import org.example.playingPiece.PlayingPiece;

public class Board {

    PlayingPiece[][] state;
    String theme;

    public Board(String theme) {
        state = new PlayingPiece[8][8];
        this.theme = theme;
    }

    public void displayBoard() {
        for(int i=0;i<8;i++) {
            for (int j=0;j<8;j++) {
                if(state[i][j]==null) {
                    System.out.print("___________\t");
                } else {
                    System.out.print(state[i][j].getTeam()+"_"+state[i][j].getType()+"\t");
                }
            }
            System.out.println();
        }
    }
}
