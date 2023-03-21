package chess.domain.board;

import java.util.Objects;

public class Square {
    private final File file;
    private final Rank rank;

    public Square(final File file, final Rank rank) {
        this.file = file;
        this.rank = rank;
    }

    public Square nextSquare(final Square source, final Move move) {
        final int nextFile = source.getFile() + move.getFile();
        final int nextRank = source.getRank() + move.getRank();

        return new Square(File.findFile(nextFile), Rank.findRank(nextRank));
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Square square = (Square) o;
        return file == square.file && rank == square.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }

    public int getFile() {
        return file.getFile();
    }

    public int getRank() {
        return rank.getRank();
    }
}
