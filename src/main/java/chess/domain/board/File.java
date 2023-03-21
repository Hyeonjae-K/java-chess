package chess.domain.board;

import java.util.Arrays;

public enum File {
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    EMPTY(-1);

    private static final char OFFSET_LETTER = 'a';

    private final int x;

    File(final int x) {
        this.x = x;
    }

    public static File findFileByLetter(final char letter) {
        return findFile(letter - OFFSET_LETTER);
    }

    public static File findFile(final int fileIndex) {
        return Arrays.stream(File.values())
                .filter(file -> file.getFile() == fileIndex)
                .findFirst()
                .orElseThrow();
    }

    public int getFile() {
        return x;
    }
}
