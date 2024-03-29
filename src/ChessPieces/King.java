package ChessPieces;

import java.util.ArrayList;

public class King extends ChessPiece {
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

        // Move north-east
        if (((x + 1) < 8) && ((y + 1) < 8)) {
            // Check if the field is free
            if (chessBoard[x + 1][y + 1] == null) {
                possibleTurns.add(new Position(x + 1, y + 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 1][y + 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 1, y + 1));
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

        // Move south-east
        if (((x + 1) < 8) && ((y - 1) >= 0)) {
            // Check if the field is free
            if (chessBoard[x + 1][y - 1] == null) {
                possibleTurns.add(new Position(x + 1, y - 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x + 1][y - 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x + 1, y - 1));
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

        // Move south-west
        if (((x - 1) >= 0) && ((y - 1) >= 0)) {
            // Check if the field is free
            if (chessBoard[x - 1][y - 1] == null) {
                possibleTurns.add(new Position(x - 1, y - 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 1][y - 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 1, y - 1));
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

        // Move north-west
        if (((x - 1) >= 0) && ((y + 1) < 8)) {
            // Check if the field is free
            if (chessBoard[x - 1][y + 1] == null) {
                possibleTurns.add(new Position(x - 1, y + 1));
            }
            // Check if there is an enemies figure standing on the occupied field
            else {
                if (chessBoard[x - 1][y + 1].getColor() != this.getColor()) {
                    possibleTurns.add(new Position(x - 1, y + 1));
                }
            }
        }

        // Castling
        if (this.getHasMoved() == false) {
            if (this.getColor() == Color.WHITE) {
                // Castling west (white)
                if ((chessBoard[1][0] == null) && (chessBoard[2][0] == null) && (chessBoard[3][0] == null) && (chessBoard[0][0].getHasMoved() == false)) {
                    possibleTurns.add(new Position(2,0));
                }
                // Castling east (white)
                if ((chessBoard[5][0] == null) && (chessBoard[6][0] == null) && (chessBoard[7][0].getHasMoved() == false)) {
                    possibleTurns.add(new Position(6,0));
                }
            }
            if (this.getColor() == Color.BLACK) {
                // Castling west (black)
                if ((chessBoard[1][7] == null) && (chessBoard[2][7] == null) && (chessBoard[3][7] == null) && (chessBoard[0][7].getHasMoved() == false)) {
                    possibleTurns.add(new Position(2,7));
                }
                // Castling east (black)
                if ((chessBoard[5][7] == null) && (chessBoard[6][7] == null) && (chessBoard[7][7].getHasMoved() == false)) {
                    possibleTurns.add(new Position(6,7));
                }
            }
        }
        return possibleTurns;
    }


    // === 7. MAIN ===
}
