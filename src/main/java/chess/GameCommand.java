package chess;

import chess.domain.board.File;
import chess.domain.board.Rank;
import chess.domain.board.Square;
import java.util.List;

public class GameCommand {
    private enum gameCommandIndex {
        COMMAND(0),
        SOURCE(1),
        TARGET(2);

        private final int index;

        gameCommandIndex(final int index) {
            this.index = index;
        }
    }

    private enum moveIndex {
        FILE(0),
        RANK(1);

        private final int index;

        moveIndex(final int index) {
            this.index = index;
        }
    }

    private static final String SQUARE_BOUND_REGULAR_EXPRESSION = "^[a-h][1-8]$";
    private static final int MOVE_COMMAND_SIZE = 3;
    private static final String START_COMMAND = "start";
    private static final String MOVE_COMMAND = "move";
    private static final String END_COMMAND = "end";

    private final List<String> gameCommand;

    public GameCommand(final List<String> gameCommand) {
        validateGameCommand(gameCommand);
        this.gameCommand = gameCommand;
    }

    private void validateGameCommand(final List<String> gameCommand) {
        final String command = gameCommand.get(gameCommandIndex.COMMAND.index);
        final boolean isCommandMove = command.equals(MOVE_COMMAND) && gameCommand.size() == MOVE_COMMAND_SIZE;

        if (isCommandMove) {
            validateMoveCommand(
                    gameCommand.get(gameCommandIndex.SOURCE.index),
                    gameCommand.get(gameCommandIndex.TARGET.index)
            );
            return;
        }

        if (!(command.equals(START_COMMAND) || command.equals(END_COMMAND))) {
            throw new IllegalArgumentException("게임 명령어가 올바르지 않습니다.");
        }
    }

    private void validateMoveCommand(final String source, final String target) {
        if (!source.matches(SQUARE_BOUND_REGULAR_EXPRESSION) && target.matches(SQUARE_BOUND_REGULAR_EXPRESSION)) {
            throw new IllegalArgumentException("정확한 source 위치와 target 위치를 입력해주세요");
        }
    }

    public boolean isStart() {
        return gameCommand.get(gameCommandIndex.COMMAND.index).equals(START_COMMAND);
    }

    public boolean isMove() {
        return gameCommand.get(gameCommandIndex.COMMAND.index).equals(MOVE_COMMAND);
    }

    public List<Square> convertToSquare() {
        final String source = gameCommand.get(gameCommandIndex.SOURCE.index);
        final String target = gameCommand.get(gameCommandIndex.TARGET.index);

        final File sourceFile = File.findFileByLetter(source.charAt(moveIndex.FILE.index));
        final Rank sourceRank = Rank.findRankByLetter(source.charAt(moveIndex.RANK.index));

        final File targetFile = File.findFileByLetter(target.charAt(moveIndex.FILE.index));
        final Rank targetRank = Rank.findRankByLetter(target.charAt(moveIndex.RANK.index));

        return List.of(new Square(sourceFile, sourceRank), new Square(targetFile, targetRank));
    }
}
