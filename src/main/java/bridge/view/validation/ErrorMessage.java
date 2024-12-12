package bridge.view.validation;

public enum ErrorMessage {
    INVALID_BRIDGE_SIZE("다리 길이 입력은 숫자여야 합니다."),
    INVALID_BRIDGE_RANGE("다리 길이 입력은 3 ~ 20 사이의 숫자여야 합니다"),
    INVALID_CHOICE_MOVE("이동할 칸 입력은 영어여야 합니다"),
    INVALID_CHOICE_SIZE("이동할 칸 입력은 한 글자여야 합니다"),
    INVALID_CHOICE_RANGE("이동할 칸 입력은 U 또는 D여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
