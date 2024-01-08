package ChessPieces;

import java.util.ArrayList;

public class King extends ChessPiece {
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
    public King(Color color) {
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


        // Move north
        if ((y + 1) < 8) {
            // Check if the field is free
            if (chessBoard[x][y + 1] == null) {
                possibleTurns.add(new Position(x, y + 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x][y + 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x, y + 1));
                }
            }
        }

        // Move east
        if ((x + 1) < 8) {
            // Check if the field is free
            if (chessBoard[x + 1][y] == null) {
                possibleTurns.add(new Position(x + 1, y));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 1][y].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 1, y));
                }
            }
        }

        // Move south
        if ((y - 1) >= 0) {
            // Check if the field is free
            if (chessBoard[x][y - 1] == null) {
                possibleTurns.add(new Position(x, y - 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x][y - 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x, y - 1));
                }
            }
        }

        // Move west
        if ((x - 1) >= 0) {
            // Check if the field is free
            if (chessBoard[x - 1][y] == null) {
                possibleTurns.add(new Position(x - 1, y));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 1][y].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 1, y));
                }
            }
        }

        // Castling
        if (this.getHasMoved() == false) {
            if (this.getColor() == Color.WHITE) {
                possibleTurns.add(new Position(0,0));
                possibleTurns.add(new Position(7,0));
            }
            if (this.getColor() == Color.BLACK) {
                possibleTurns.add(new Position(0,7));
                possibleTurns.add(new Position(7,7));
            }
        }
        return possibleTurns;
    }


    // === 7. MAIN ===
}
