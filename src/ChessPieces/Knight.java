package ChessPieces;

import java.util.ArrayList;

public class Knight extends ChessPiece {
    // === 0. NOTES ===
    /*
                   north
    y-axis       color black
        7| R  Kn B  Q  Ki B  Kn R
        6| P  P  P  P  P  P  P  P
        5|
        4|
        3|          p
        2|
        1| P  P  P  P  P  P  P  P
        0| R  Kn B  Ki Q  B  Kn R
         + _  _  _  _  _  _  _  _  x-axis
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
    public Knight(Color color) {
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


        // Move north-east L
        if (((x + 1) < 8) && ((y + 2) < 8)) {
            // Check if the field is free
            if (chessBoard[x + 1][y + 2] == null) {
                possibleTurns.add(new Position(x + 1, y + 2));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 1][y + 2].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 1, y + 2));
                }
            }
        }

        // Move east-north L
        if (((x + 2) < 8) && ((y + 1) < 8)) {
            // Check if the field is free
            if (chessBoard[x + 2][y + 1] == null) {
                possibleTurns.add(new Position(x + 2, y + 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 2][y + 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 2, y + 1));
                }
            }
        }

        // Move east-south L
        if (((x + 2) < 8) && ((y - 1) >= 0)) {
            // Check if the field is free
            if (chessBoard[x + 2][y - 1] == null) {
                possibleTurns.add(new Position(x + 2, y - 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 2][y - 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 2, y - 1));
                }
            }
        }

        // Move south-east L
        if (((x + 1) < 8) && ((y - 2) >= 0)) {
            // Check if the field is free
            if (chessBoard[x + 1][y - 2] == null) {
                possibleTurns.add(new Position(x + 1, y - 2));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 1][y - 2].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 1, y - 2));
                }
            }
        }

        // Move south-west L
        if (((x - 1) >= 0) && ((y - 2) >= 0)) {
            // Check if the field is free
            if (chessBoard[x - 1][y - 2] == null) {
                possibleTurns.add(new Position(x - 1, y - 2));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 1][y - 2].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 1, y - 2));
                }
            }
        }

        // Move west-south L
        if (((x - 2) >= 0) && ((y - 1) >= 0)) {
            // Check if the field is free
            if (chessBoard[x - 2][y - 1] == null) {
                possibleTurns.add(new Position(x - 2, y - 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 2][y - 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 2, y - 1));
                }
            }
        }

        // Move west-north L
        if (((x - 2) >= 0) && ((y + 1) < 8)) {
            // Check if the field is free
            if (chessBoard[x - 2][y + 1] == null) {
                possibleTurns.add(new Position(x - 2, y + 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 2][y + 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 2, y + 1));
                }
            }
        }

        // Move north-west L
        if (((x - 1) >= 0) && ((y + 2) < 8)) {
            // Check if the field is free
            if (chessBoard[x - 1][y + 2] == null) {
                possibleTurns.add(new Position(x - 1, y + 2));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 1][y + 2].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 1, y + 2));
                }
            }
        }
        return possibleTurns;
    }


    // === 7. MAIN ===
}
