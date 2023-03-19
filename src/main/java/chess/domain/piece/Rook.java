package chess.domain.piece;

import chess.domain.board.Move;
import chess.domain.board.Square;
import java.util.List;

public class Rook extends Piece {
    private static final List<Move> possibleMoves = makePossibleMove();

    public Rook(final Camp camp) {
        super(camp, Role.ROOK);
    }

    private static List<Move> makePossibleMove() {
        return List.of(
                Move.UP,
                Move.DOWN,
                Move.LEFT,
                Move.RIGHT
        );
    }

    @Override
    public boolean isMovable(final Square source, final Square target, final Move move) {
        return possibleMoves.contains(move);
    }
}
