package bridge.view.controller;

import bridge.view.InputView;
import bridge.view.OutputView;
import bridge.view.handler.InputHandler;

public class BridgeController {
    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);

    public void start() {
        bridgeInputStart();
    }

    public void bridgeInputStart() {
        outputView.printBridgeSizeInputText();
        inputHandler.receiveValidatedBridgeSize();
    }
}
