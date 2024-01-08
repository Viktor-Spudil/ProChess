import java.util.ArrayList;


import ChessPieces.*;


public abstract class ChessLogic {
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
    // === 4. STATIC METHODS ===
    public static boolean isValidTurn(ChessPiece[][] chessBoard, Position moveFrom, Position moveTo) {
        ArrayList<Position> possibleTurns = getPossibleTurns(chessBoard, moveFrom);

        return possibleTurns.contains(moveTo);
    }

    public static ArrayList<Position> getPossibleTurns(ChessPiece[][] chessBoard, Position position) {
        return chessBoard[position.x][position.y].getPossibleTurns(chessBoard, position);
    }


    // === 5. GETTER AND SETTER ===
    // === 6. MISCELLANEOUS OBJECT METHODS ===
    // === 7. MAIN ===
}
