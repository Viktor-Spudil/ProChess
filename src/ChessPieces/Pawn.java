package ChessPieces;

import java.util.ArrayList;

public class Pawn extends ChessPiece {
    // === 0. NOTES ===
    // === 1. CLASS VARIABLES ===
    // === 2. OBJECT VARIABLES ===
    // === 3. CONSTRUCTORS ===
    // --- 3.1 STATIC BLOCKS ---
    // --- 3.2 INSTANCE INITIALIZER ---
    // --- 3.3 REAL CONSTRUCTORS ---
    public Pawn(Color color) {
        super(color);
    }


    // === 4. STATIC METHODS ===
    // === 5. GETTER AND SETTER ===
    // === 6. MISCELLANEOUS OBJECT METHODS ===
    @Override
    public ArrayList<Position> getPossibleTurns(ChessPiece[][] chessBoard, Position position) {
        ArrayList<Position> possibleTurns = new ArrayList<>();
        int x = position.x;
        int y = position.y;

        // WHITE
        // Move north (white)
        if ((this.getColor() == Color.WHITE) && ((y + 1) < 8)) {
            // Check if the field is free
            if (chessBoard[x][y + 1] == null) {
                possibleTurns.add(new Position(x, y + 1));
            }
        }

        // Kill north-west (white)
        if ((this.getColor() == Color.WHITE) && ((x - 1) >= 0) && ((y + 1) < 8)) {
            // Check if there is an enemies figure standing on the occupied field
            if ((chessBoard[x - 1][y + 1] != null) && (chessBoard[x - 1][y + 1].getColor() != this.getColor())) {
                possibleTurns.add(new Position(x - 1, y + 1));
            }
        }

        // Kill north-east (white)
        if ((this.getColor() == Color.WHITE) && ((x + 1) < 8) && ((y + 1) < 8)) {
            // Check if there is an enemies figure standing on the occupied field
            if ((chessBoard[x + 1][y + 1] != null) && (chessBoard[x + 1][y + 1].getColor() != this.getColor())) {
                possibleTurns.add(new Position(x + 1, y + 1));
            }
        }

        // TODO: En-Passante


        // BLACK
        // Move south (black)
        if ((this.getColor() == Color.BLACK) && ((y - 1) >= 0)) {
            // Check if the field is free
            if (chessBoard[x][y - 1] == null) {
                possibleTurns.add(new Position(x, y - 1));
            }
        }

        // Kill south-west (black)
        if ((this.getColor() == Color.BLACK) && ((x - 1) >= 0) && ((y - 1) >= 0)) {
            // Check if there is an enemies figure standing on the occupied field
            if ((chessBoard[x - 1][y - 1] != null) && (chessBoard[x - 1][y - 1].getColor() != this.getColor())) {
                possibleTurns.add(new Position(x - 1, y - 1));
            }
        }

        // Kill south-east (black)
        if ((this.getColor() == Color.BLACK) && ((x + 1) < 8) && ((y - 1) >= 0)) {
            // Check if there is an enemies figure standing on the occupied field
            if ((chessBoard[x + 1][y - 1] != null) && (chessBoard[x + 1][y - 1].getColor() != this.getColor())) {
                possibleTurns.add(new Position(x + 1, y - 1));
            }
        }

        // TODO: En-Passante
        return possibleTurns;
    }


    // === 7. MAIN ===
}
