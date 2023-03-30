package chess.controller.state;

import chess.domain.game.Camp;
import chess.domain.game.Game;
import chess.view.OutputView;

public class KingDead extends State {
    KingDead(final Game game) {
        super(game);
        status();
    }

    @Override
    public State status() {
        final double whiteScore = game().calculateScore(Camp.WHITE);
        final double blackScore = game().calculateScore(Camp.BLACK);
        final Camp winner = game().judgeWinner();
        OutputView.printStatus(whiteScore, blackScore, winner);

        return this;
    }
}
