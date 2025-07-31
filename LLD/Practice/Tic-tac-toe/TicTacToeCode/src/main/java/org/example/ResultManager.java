package org.example;

import org.example.model.PlayingPiece;

import java.util.ArrayList;
import java.util.List;

public class ResultManager {
    private List<Player> winners;

    public ResultManager() {
        winners = new ArrayList<>();
    }

    public boolean checkWinner(PlayingPiece[][] state, Player player, int row, int col) {
        int n=state.length;
        boolean ans = true;
        for(int i=0;i<n;i++) {
            if(state[row][i]!=player.pp) {
                ans = false;
                break;
            }
        }
        if(ans) {
            winners.add(player);
            return true;
        }
        ans=true;
        for(int i=0;i<n;i++) {
            if(state[i][col]!=player.pp) {
                ans = false;
                break;
            }
        }
        if(ans) {
            winners.add(player);
            return true;
        }
        ans=true;
        if(row==col) {
            for(int i=0;i<n;i++) {
                if(state[i][i]!=player.pp) {
                    ans = false;
                    break;
                }
            }
            if(ans) {
                winners.add(player);
                return true;
            }
        }

        if(row+col==n-1) {
            for(int i=0;i<n;i++) {
                if(state[i][n-1-i]!=player.pp) {
                    ans = false;
                    break;
                }
            }
            if(ans) {
                winners.add(player);
                return true;
            }
        }
        return false;
    }

    public List<Player> getWinners() {
        return winners;
    }

}
