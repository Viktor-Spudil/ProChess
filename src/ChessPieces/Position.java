package ChessPieces;

public class Position {
    // === 0. NOTES ===
    // === 1. CLASS VARIABLES ===
    // === 2. OBJECT VARIABLES ===
    public int x;
    public int y;


    // === 3. CONSTRUCTORS ===
    // --- 3.1 STATIC BLOCKS ---
    // --- 3.2 INSTANCE INITIALIZER ---
    // --- 3.3 REAL CONSTRUCTORS ---
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // === 4. STATIC METHODS ===
    // === 5. GETTER AND SETTER ===
    // === 6. MISCELLANEOUS OBJECT METHODS ===
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            if ((this.x == ((Position) obj).x) && (this.y == ((Position) obj).y)) {
                return true;
            }
        }
        return false;
    }


    // === 7. MAIN ===
}
