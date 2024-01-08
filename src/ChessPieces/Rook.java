package ChessPieces;

import java.util.ArrayList;

public class Rook extends ChessPiece {
    // === 0. NOTES ===
    /*
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
    public Rook(Color color) {
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
        return possibleTurns;
    }


    // === 7. MAIN ===
}
