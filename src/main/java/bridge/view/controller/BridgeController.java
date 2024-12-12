package bridge.view.controller;

import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.view.InputView;
import bridge.view.OutputView;
import bridge.view.handler.InputHandler;
import java.util.List;

public class BridgeController {
    public static int bridgeSize = 0;

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);
    BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
    BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);

    public void start() {
        bridgeInputStart();
        makeBridgeStart();

    }

    public void bridgeInputStart() {
        outputView.printBridgeSizeInputText();
        bridgeSize = inputHandler.receiveValidatedBridgeSize();
    }

    public void makeBridgeStart() {
        bridgeMaker.makeBridge(bridgeSize);
    }
}
