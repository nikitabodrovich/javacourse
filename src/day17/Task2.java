package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessRaws = new ChessPiece[8][8];
        ChessBoard chessBoard = new ChessBoard(chessRaws);
        for (int i = 0; i<chessRaws.length; i++){
            for (int j = 0; j<chessRaws[i].length; j++){
                chessRaws[i][j] = ChessPiece.EMPTY;
            }
        }
        //1st raw
        chessRaws[7][5] = ChessPiece.ROOK_WHITE;
        chessRaws[7][6] = ChessPiece.KING_WHITE;
        //2nd raw
        chessRaws[6][0] = ChessPiece.PAWN_WHITE;
        chessRaws[6][3] = ChessPiece.QUEEN_WHITE;
        chessRaws[6][5] = ChessPiece.PAWN_WHITE;
        chessRaws[6][7] = ChessPiece.PAWN_WHITE;
        //3rd raw
        chessRaws[5][4] = ChessPiece.BISHOP_WHITE;
        chessRaws[5][5] = ChessPiece.PAWN_WHITE;
        //4th raw
        chessRaws[4][3] = ChessPiece.BISHOP_BLACK;
        chessRaws[4][4] = ChessPiece.PAWN_WHITE;
        //5th raw
        chessRaws[3][0] = ChessPiece.QUEEN_BLACK;
        chessRaws[3][3] = ChessPiece.BISHOP_WHITE;
        //6th raw
        chessRaws[2][0] = ChessPiece.PAWN_BLACK;
        chessRaws[2][2] = ChessPiece.KNIGHT_BLACK;
        chessRaws[2][6] = ChessPiece.PAWN_BLACK;
        //7th raw
        chessRaws[1][1] = ChessPiece.ROOK_WHITE;
        chessRaws[1][4] = ChessPiece.PAWN_BLACK;
        chessRaws[1][5] = ChessPiece.PAWN_BLACK;
        chessRaws[1][7] = ChessPiece.PAWN_BLACK;
        //8th raw
        chessRaws[0][0] = ChessPiece.ROOK_BLACK;
        chessRaws[0][5] = ChessPiece.ROOK_BLACK;
        chessRaws[0][6] = ChessPiece.KING_BLACK;
       chessBoard.print();
    }
}
