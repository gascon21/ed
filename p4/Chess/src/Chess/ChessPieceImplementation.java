package Chess;

public class ChessPieceImplementation implements ChessPiece{

    Color color;
    Type typ;
    boolean moved;
    
    public ChessPieceImplementation(Color color, Type typ){
        this.color = color;
        this.typ = typ;
        moved = false;
    }
    
    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Type getType() {
        return typ;
    }

    @Override
    public void notifyMoved() {
        if(!moved){
            moved = true;
        }
    }

    @Override
    public boolean wasMoved() {
        return moved;
    }

    @Override
    public PiecePosition[] getAvailablePositions(ChessBoard aBoard) {
        switch (typ){
            case PAWN:
                return ChessMovementManager.getAvailablePositionsOfPawn(this, aBoard);
            case BISHOP:
                return ChessMovementManager.getAvailablePositionsOfBishop(this, aBoard);
            case KING:
                return ChessMovementManager.getAvailablePositionsOfKing(this, aBoard);
            case QUEEN:
                return ChessMovementManager.getAvailablePositionsOfQueen(this, aBoard);
            case KNIGHT:
                return ChessMovementManager.getAvailablePositionsOfKnight(this, aBoard);
            default:
                return ChessMovementManager.getAvailablePositionsOfRook(this, aBoard);
        }
    }
    
}
	