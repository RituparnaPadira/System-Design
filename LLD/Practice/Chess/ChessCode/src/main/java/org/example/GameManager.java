package org.example;

import org.example.model.PlayingPieceType;
import org.example.model.Team;
import org.example.playingPiece.PlayingPiece;
import org.example.user.Player;
import org.example.user.User;

import java.util.List;
import java.util.Scanner;

public class GameManager {

    List<Player> players;
    List<User> viewers;
    Board board;
    PlayingPieceFactory factory;

    public GameManager(List<Player> players, List<User> viewers, String theme) {
        this.viewers = viewers;
        this.board = new Board(theme);
        factory = new PlayingPieceFactory();
        if(players.get(0).getTeam()==Team.BLACK){
            Player white = players.get(1);
            players.set(1, players.get(0));
            players.set(0, white);
        }
        this.players = players;
    }

    public void startGame() {
        try {
            initGame();
        } catch (Exception ex) {
            System.out.println("Could not start game "+ex);
        }
        Scanner sc = new Scanner(System.in);
        boolean turn = false;
        while(true) {
            board.displayBoard();
            Player curPlayer;
            Player otherPlayer;
            if(!turn) {
                curPlayer = players.get(0);
                otherPlayer = players.get(1);
            } else {
                curPlayer = players.get(1);
                otherPlayer = players.get(0);
            }
            System.out.println(curPlayer.getName()+"'s turn. Please enter start position & end position of your piece");
            int initialRow;
            int initialCol;
            int finalRow;
            int finalCol;
            while(true) {
                initialRow = sc.nextInt();
                initialCol = sc.nextInt();
                finalRow = sc.nextInt();
                finalCol = sc.nextInt();
                if ((initialCol == finalCol && initialRow == finalRow) || finalCol < 0 || finalRow < 0 || finalCol > 7 || finalRow > 7) {
                    System.out.println("Invalid position. Enter again");
                    continue;
                }
                PlayingPiece curpp = board.state[initialRow][initialCol];
                if(curpp==null ||
                        curpp.getTeam() != curPlayer.getTeam()) {
                    System.out.println("Square does not have your piece. Enter again");
                    continue;
                }
                if(!curpp.isValid(initialRow, initialCol, finalRow, finalCol, board.state)) {
                    System.out.println("Invalid move. Try again");
                    continue;
                }
                break;
            }
            if(board.state[finalRow][finalCol]!=null) {
                PlayingPiece curPiece = board.state[finalRow][finalCol];
                if(curPiece.getType()==PlayingPieceType.KING) {
                    System.out.println("Game Over! "+curPlayer.getName()+" won!");
                    break;
                }
                otherPlayer.playingPieces.remove(curPiece);
                System.out.println(otherPlayer.getName()+" lost a "+curPiece.getType());
            }
            board.state[finalRow][finalCol] = board.state[initialRow][initialCol];
            board.state[initialRow][initialCol] = null;
            turn = !turn;
        }

    }

    private void initGame() throws Exception {
        for(int i=0;i<8;i++) {
            board.state[1][i] = factory.getPlayingPiece(PlayingPieceType.PAWN, Team.WHITE);
            board.state[6][i] = factory.getPlayingPiece(PlayingPieceType.PAWN, Team.BLACK);
        }
        board.state[0][0] = factory.getPlayingPiece(PlayingPieceType.ROOK, Team.WHITE);
        board.state[0][7] = factory.getPlayingPiece(PlayingPieceType.ROOK, Team.WHITE);
        board.state[7][0] = factory.getPlayingPiece(PlayingPieceType.ROOK, Team.BLACK);
        board.state[7][7] = factory.getPlayingPiece(PlayingPieceType.ROOK, Team.BLACK);

        board.state[0][1] = factory.getPlayingPiece(PlayingPieceType.KNIGHT, Team.WHITE);
        board.state[0][6] = factory.getPlayingPiece(PlayingPieceType.KNIGHT, Team.WHITE);
        board.state[7][1] = factory.getPlayingPiece(PlayingPieceType.KNIGHT, Team.BLACK);
        board.state[7][6] = factory.getPlayingPiece(PlayingPieceType.KNIGHT, Team.BLACK);

        board.state[0][2] = factory.getPlayingPiece(PlayingPieceType.BISHOP, Team.WHITE);
        board.state[0][5] = factory.getPlayingPiece(PlayingPieceType.BISHOP, Team.WHITE);
        board.state[7][2] = factory.getPlayingPiece(PlayingPieceType.BISHOP, Team.BLACK);
        board.state[7][5] = factory.getPlayingPiece(PlayingPieceType.BISHOP, Team.BLACK);

        board.state[0][3] = factory.getPlayingPiece(PlayingPieceType.QUEEN, Team.WHITE);
        board.state[0][4] = factory.getPlayingPiece(PlayingPieceType.KING, Team.WHITE);
        board.state[7][3] = factory.getPlayingPiece(PlayingPieceType.QUEEN, Team.BLACK);
        board.state[7][4] = factory.getPlayingPiece(PlayingPieceType.KING, Team.BLACK);

        for(int i=0;i<8;i++) {
            players.get(0).playingPieces.add(board.state[0][i]);
            players.get(0).playingPieces.add(board.state[1][i]);
            players.get(1).playingPieces.add(board.state[6][i]);
            players.get(1).playingPieces.add(board.state[7][i]);
        }

    }

}
