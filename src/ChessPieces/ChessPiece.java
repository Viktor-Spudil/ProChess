package ChessPieces;

import java.util.ArrayList;

public abstract class ChessPiece {
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
    private Color color;
    private boolean hasMoved = false;


    // === 3. CONSTRUCTORS ===
    // --- 3.1 STATIC BLOCKS ---
    // --- 3.2 INSTANCE INITIALIZER ---
    // --- 3.3 REAL CONSTRUCTORS ---
    public ChessPiece(Color color) {
        this.color = color;
    }


    // === 4. STATIC METHODS ===
    // === 5. GETTER AND SETTER ===
    public Color getColor() {
        return this.color;
    }

    public boolean getHasMoved() {
        return this.hasMoved;
    }


    // === 6. MISCELLANEOUS OBJECT METHODS ===
    public abstract ArrayList<Position> getPossibleTurns(ChessPiece[][] chessBoard, Position position);


    // === 7. MAIN ===
}
