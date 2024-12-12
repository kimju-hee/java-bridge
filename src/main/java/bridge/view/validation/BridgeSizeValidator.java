package bridge.view.validation;

public class BridgeSizeValidator {
    private static int MIN_BRIDGE_NUMBER = 3;
    private static int MAX_BRIDGE_NUMBER = 20;

    public static void validator(String input) {
        isNumberic(input);
        isValidRange(input);
    }

    public static void isNumberic(String input) {
        if (!input.matches("\\d+")) {
            throwError();
        }
    }

    public static void isValidRange(String input) {
        int num = Integer.parseInt(input);
        if (num < MIN_BRIDGE_NUMBER || num > MAX_BRIDGE_NUMBER) {
            throwError2();
        }
    }


    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_BRIDGE_SIZE.getMessage());
    }
    private static void throwError2() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_BRIDGE_RANGE.getMessage());
    }
}