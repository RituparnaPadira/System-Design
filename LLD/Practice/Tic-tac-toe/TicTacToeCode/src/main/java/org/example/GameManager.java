package org.example;

import java.util.List;
import java.util.Scanner;

public class GameManager {
    private final List<Player> players;
    private final Board board;
    private final ResultManager resultManager;

    public GameManager(int boardSize, List<Player> players) {
        this.players = players;
        board = new Board(boardSize);
        resultManager = new ResultManager();
    }

    private void displayBoard(){
        int n=board.state.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(board.state[i][j]+"\t\t");
            }
            System.out.println();
        }
    }


    public void startGame() {
        int turn=0, numOfPlayers = players.size(), boardSize = board.state.length,
                maxTurns = boardSize*boardSize, curPlayerIndex = 0;
        Scanner sc = new Scanner(System.in);
        while(++turn<=maxTurns && numOfPlayers>1) {
            Player curPlayer = players.get(curPlayerIndex);
            System.out.println(curPlayer.name+"'s turn. Select a row & column");
            int row, col;
            while(true) {
                row = sc.nextInt();
                col = sc.nextInt();
                if(row<0||col<0||row>=boardSize||col>=boardSize||board.state[row][col]!=null) {
                    System.out.println("This position either doesn't exist or is already taken. Please enter a different position");
                } else {
                    board.state[row][col] = curPlayer.pp;
                    displayBoard();
                    break;
                }
            }
            if(resultManager.checkWinner(board.state, curPlayer, row, col)) {
                players.remove(curPlayer);
                numOfPlayers--;
            } else {
                curPlayerIndex = (curPlayerIndex+1)%numOfPlayers;
            }
        }
        declareWinners();
    }

    private void declareWinners() {
        List<Player> winners = resultManager.getWinners();
        System.out.println("**************** Results ******************");
        if(winners.size()==0) {
            System.out.println("Match tie!");
        }
        for(int i=0;i<winners.size();i++) {
            System.out.println(winners.get(i).name+" - "+i+1);
        }
    }



}
