package ChessPieces;

import java.util.ArrayList;

public class Pawn extends ChessPiece {
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
    private boolean isEnPassantTarget = false;


    // === 3. CONSTRUCTORS ===
    // --- 3.1 STATIC BLOCKS ---
    // --- 3.2 INSTANCE INITIALIZER ---
    // --- 3.3 REAL CONSTRUCTORS ---
    public Pawn(Color color) {
        super(color);
    }


    // === 4. STATIC METHODS ===
    // === 5. GETTER AND SETTER ===
    public boolean getIsEnPassantTarget() {
        return this.isEnPassantTarget;
    }

    public void setIsEnPassantTarget(boolean isEnPassantTarget) {
        this.isEnPassantTarget = isEnPassantTarget;
    }


    // === 6. MISCELLANEOUS OBJECT METHODS ===
    @Override
    public ArrayList<Position> getPossibleTurns(ChessPiece[][] chessBoard, Position position) {
        ArrayList<Position> possibleTurns = new ArrayList<>();
        int x = position.x;
        int y = position.y;

        // WHITE
        // Initial move (white)
        if ((this.getColor() == Color.WHITE) && (this.getHasMoved() == false)) {
            // Check if the field is free
            if (chessBoard[x][y + 2] == null) {
                possibleTurns.add(new Position(x, y + 2));
            }
        }

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
            else {
                // En passant
                if (enPassantWestPossible(chessBoard, position)) {
                    possibleTurns.add(new Position(x - 1, y + 1));
                }
            }
        }

        // Kill north-east (white)
        if ((this.getColor() == Color.WHITE) && ((x + 1) < 8) && ((y + 1) < 8)) {
            // Check if there is an enemies figure standing on the occupied field
            if ((chessBoard[x + 1][y + 1] != null) && (chessBoard[x + 1][y + 1].getColor() != this.getColor())) {
                possibleTurns.add(new Position(x + 1, y + 1));
            }
            else {
                // En passant
                if (enPassantEastPossible(chessBoard, position)) {
                    possibleTurns.add(new Position(x + 1, y + 1));
                }
            }
        }


        // BLACK
        // Initial move (black)
        if ((this.getColor() == Color.BLACK) && (this.getHasMoved() == false)) {
            // Check if the field is free
            if (chessBoard[x][y - 2] == null) {
                possibleTurns.add(new Position(x, y - 2));
            }
        }

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
            else {
                // En passant
                if (enPassantWestPossible(chessBoard, position)) {
                    possibleTurns.add(new Position(x - 1, y - 1));
                }
            }
        }

        // Kill south-east (black)
        if ((this.getColor() == Color.BLACK) && ((x + 1) < 8) && ((y - 1) >= 0)) {
            // Check if there is an enemies figure standing on the occupied field
            if ((chessBoard[x + 1][y - 1] != null) && (chessBoard[x + 1][y - 1].getColor() != this.getColor())) {
                possibleTurns.add(new Position(x + 1, y - 1));
            }
            else {
                // En passant
                if (enPassantEastPossible(chessBoard, position)) {
                    possibleTurns.add(new Position(x + 1, y - 1));
                }
            }
        }
        return possibleTurns;
    }

    private boolean enPassantWestPossible(ChessPiece[][] chessBoard, Position position) {
        int x = position.x;
        int y = position.y;

        if ((chessBoard[x - 1][y].getClass() == Pawn.class) && (chessBoard[x - 1][y].getColor() != this.getColor()) && ((Pawn) chessBoard[x - 1][y]).getIsEnPassantTarget()) {
            return true;
        }

        return false;
    }

    private boolean enPassantEastPossible(ChessPiece[][] chessBoard, Position position) {
        int x = position.x;
        int y = position.y;

        if ((chessBoard[x + 1][y].getClass() == Pawn.class) && (chessBoard[x + 1][y].getColor() != this.getColor()) && ((Pawn) chessBoard[x + 1][y]).getIsEnPassantTarget()) {
            return true;
        }
        return false;
    }


    // === 7. MAIN ===
}
