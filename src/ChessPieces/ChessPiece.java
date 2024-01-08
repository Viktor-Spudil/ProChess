package ChessPieces;

import java.util.ArrayList;

public abstract class ChessPiece {
    // === 0. NOTES ===
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
