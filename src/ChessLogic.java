import java.util.ArrayList;


import ChessPieces.*;


public abstract class ChessLogic {
    // === 0. NOTES ===
    // === 1. CLASS VARIABLES ===
    // === 2. OBJECT VARIABLES ===
    // === 3. CONSTRUCTORS ===
    // --- 3.1 STATIC BLOCKS ---
    // --- 3.2 INSTANCE INITIALIZER ---
    // --- 3.3 REAL CONSTRUCTORS ---
    // === 4. STATIC METHODS ===
    public static boolean isValidTurn(ChessPiece[][] chessBoard, Position from, Position to) {
        ArrayList<Position> possibleTurns = getPossibleTurns(chessBoard, from);

        return possibleTurns.contains(to);
    }

    public static ArrayList<Position> getPossibleTurns(ChessPiece[][] chessBoard, Position position) {
        return chessBoard[position.x][position.y].getPossibleTurns(chessBoard, position);
    }


    // === 5. GETTER AND SETTER ===
    // === 6. MISCELLANEOUS OBJECT METHODS ===
    // === 7. MAIN ===
}
