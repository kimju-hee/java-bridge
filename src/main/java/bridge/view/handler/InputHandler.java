package bridge.view.handler;

import bridge.view.ErrorView;
import bridge.view.InputView;
import java.util.function.Supplier;

public class InputHandler {
    private final InputView inputView;

    public InputHandler(InputView inputView) {
        this.inputView = inputView;
    }

    public int receiveValidatedBridgeSize() {
        return receiveValidatedInput(inputView::readBridgeSize);
    }

    public String receiveValidUserMoveInput() {
        return receiveValidatedInput(inputView::readMoving);
    }

    public String receiveValidUserAnswerInput() {
        return receiveValidatedInput(inputView::readGameCommand);
    }

    private <T> T receiveValidatedInput(Supplier<T> inputView) {
        while (true) {
            try {
                return inputView.get();
            } catch (IllegalArgumentException exception) {
                ErrorView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
