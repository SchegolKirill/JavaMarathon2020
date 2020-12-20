package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> listOfChess = new ArrayList<>();
        for(int i = 0; i <= 3; i++) {
            listOfChess.add(ChessPiece.PAWN_WHITE);
        }
        for(int i = 0; i <= 3; i++) {
            listOfChess.add(ChessPiece.ROOK_BLACK);
        }
        for(ChessPiece chess : listOfChess) {
            System.out.print(chess + " ");
        }
    }
}