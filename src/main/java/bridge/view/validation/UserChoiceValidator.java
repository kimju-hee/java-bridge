package bridge.view.validation;

import java.util.Arrays;
import java.util.List;

public class UserChoiceValidator {
    private static List<String> validEng = Arrays.asList("U", "D");

    public static void validator(String input) {
        isEnglish(input);
        isValidLength(input);
        isValidRange(input);
    }

    public static void isEnglish(String input) {
        if (!input.matches("^[a-zA-Z]+$")) {
            throwError();
        }
    }

    public static void isValidLength(String input) {
        if (input.length() != 1) {
            throwError2();
        }
    }

    public static void isValidRange(String input) {
        if (!validEng.contains(input)) {
            throwError3();
        }
    }


    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_CHOICE_MOVE.getMessage());
    }
    private static void throwError2() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_CHOICE_SIZE.getMessage());
    }
    private static void throwError3() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_CHOICE_RANGE.getMessage());
    }
}