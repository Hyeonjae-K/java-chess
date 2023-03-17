package chess.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final String SPLIT_DELIMITER = " ";

    private final Scanner scanner = new Scanner(System.in);

    public List<String> readGameCommand() {
        final String input = scanner.nextLine();
        return splitAsList(input);
    }

    private static List<String> splitAsList(final String input) {
        return Arrays.stream(input.split(SPLIT_DELIMITER))
                .map(String::strip)
                .collect(Collectors.toList());
    }
}
