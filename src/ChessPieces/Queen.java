package ChessPieces;

import java.util.ArrayList;

public class Queen extends ChessPiece {
    // === 0. NOTES ===
    /*
    y-axis       color black
        7|
        6|
        5|
        4|
        3|
        2|    p
        1|
        0| _  _  _  _  _  _  _  _  x-axis
           0  1  2  3  4  5  6  7
                 color white

        p = (x,y)
     */


    // === 1. CLASS VARIABLES ===
    // === 2. OBJECT VARIABLES ===
    // === 3. CONSTRUCTORS ===
    // --- 3.1 STATIC BLOCKS ---
    // --- 3.2 INSTANCE INITIALIZER ---
    // --- 3.3 REAL CONSTRUCTORS ---
    public Queen(Color color) {
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


        // ROOK BEHAVIOUR
        // Move north
        for (int i = 1; (y + i) < 8; i++) {
            // Check if the field is free
            if (chessBoard[x][y + i] == null) {
                possibleTurns.add(new Position(x, y + i));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x][y + i].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x, y + i));
                }
                break;
            }
        }

        // Move east
        for (int i = 1; (x + i) < 8; i++) {
            // Check if the field is free
            if (chessBoard[x + i][y] == null) {
                possibleTurns.add(new Position(x + i, y));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + i][y].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + i, y));
                }
                break;
            }
        }

        // Move south
        for (int i = 1; (y - i) >= 0; i++) {
            // Check if the field is free
            if (chessBoard[x][y - i] == null) {
                possibleTurns.add(new Position(x, y - i));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x][y - i].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x, y - i));
                }
                break;
            }
        }

        // Move west
        for (int i = 1; (x - i) >= 0; i++) {
            // Check if the field is free
            if (chessBoard[x - i][y] == null) {
                possibleTurns.add(new Position(x - i, y));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - i][y].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - i, y));
                }
                break;
            }
        }


        // BISHOP BEHAVIOUR
        // Move north-east
        for (int i = 1; ((x + i) < 8) && ((y + i) < 8); i++) {
            // Check if the field is free
            if (chessBoard[x + i][y + i] == null) {
                possibleTurns.add(new Position(x + i, y + i));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + i][y + i].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + i, y + i));
                }
                break;
            }
        }

        // Move south-east
        for (int i = 1; ((x + i) < 8) && ((y - i) >= 0); i++) {
            // Check if the field is free
            if (chessBoard[x + i][y - i] == null) {
                possibleTurns.add(new Position(x + i, y - i));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + i][y - i].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + i, y - i));
                }
                break;
            }
        }

        // Move south-west
        for (int i = 1; ((x - i) >= 0) && ((y - i) >= 0); i++) {
            // Check if the field is free
            if (chessBoard[x - i][y - i] == null) {
                possibleTurns.add(new Position(x - i, y - i));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - i][y - i].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - i, y - i));
                }
                break;
            }
        }

        // Move north-west
        for (int i = 1; ((x - i) >= 0) && ((y + i) < 8); i++) {
            // Check if the field is free
            if (chessBoard[x - i][y + i] == null) {
                possibleTurns.add(new Position(x - i, y + i));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - i][y + i].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - i, y + i));
                }
                break;
            }
        }
        return possibleTurns;
    }


    // === 7. MAIN ===
}
