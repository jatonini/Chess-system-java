package Application.Chess;

import Application.BoardGame.Board;
import Application.BoardGame.Piece;

public class ChessPiece extends Piece {
    
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

 
}
