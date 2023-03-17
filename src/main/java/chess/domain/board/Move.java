package chess.domain.board;

import java.util.Arrays;

public enum Move {
    RIGHT(1, 0),
    LEFT(-1, 0),
    UP(0, 1),
    DOWN(0, -1),
    RIGHT_UP(1, 1),
    RIGHT_DOWN(1, -1),
    LEFT_UP(-1, 1),
    LEFT_DOWN(-1, -1),
    EMPTY(0, 0);

    private final int file;
    private final int rank;

    Move(final int file, final int rank) {
        this.file = file;
        this.rank = rank;
    }

    public static Move calculateDirection(final Square source, final Square target) {
        final int directionFile = target.getFile() - source.getFile();
        final int directionRank = target.getRank() - source.getRank();

        if (directionFile != 0 && directionRank != 0 && Math.abs(directionFile / directionRank) != 1) {
            return EMPTY;
        }

        return Arrays.stream(Move.values())
                .filter(move -> isSameDirection(directionFile, directionRank, move))
                .findFirst()
                .orElse(EMPTY);
    }

    private static boolean isSameDirection(final int directionFile, final int directionRank, final Move move) {
        return move.file == Integer.signum(directionFile) && move.rank == Integer.signum(directionRank);
    }

    public static boolean isMoveForward(final Move move) {
        return move == Move.UP || move == Move.DOWN;
    }

    public static boolean isMoveDiagonal(final Move move) {
        return move == Move.RIGHT_UP || move == Move.RIGHT_DOWN || move == Move.LEFT_UP || move == Move.LEFT_DOWN;

    }

    public int getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }
}
