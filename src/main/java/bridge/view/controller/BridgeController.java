package bridge.view.controller;

import bridge.BridgeGame;
import bridge.BridgeMaker;
import bridge.BridgeRandomNumberGenerator;
import bridge.view.InputView;
import bridge.view.OutputView;
import bridge.view.handler.InputHandler;
import java.util.ArrayList;
import java.util.List;

public class BridgeController {
    public static int bridgeSize = 0;
    public static List<String> realBridge = new ArrayList<>();
    public static boolean isGameOver = false;
    private int num = 0;
    private int userPosition = 0;

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    InputHandler inputHandler = new InputHandler(inputView);
    BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
    BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
    BridgeGame bridgeGame = new BridgeGame();

    public void start() {
        bridgeInputStart();
        makeBridgeStart();
        playGame();
        printResult();
    }

    public void bridgeInputStart() {
        outputView.printBridgeSizeInputText();
        bridgeSize = inputHandler.receiveValidatedBridgeSize();
    }

    public void makeBridgeStart() {
        realBridge = bridgeMaker.makeBridge(bridgeSize);
    }

    public String userInputStart() {
        outputView.printUserChoiceInputText();
        String input = inputHandler.receiveValidUserMoveInput();
        return input;
    }

    public int playGame() {
        while (!isGameOver) {

            if (num == bridgeSize) {
                return num;
            }

            String input = userInputStart();
            checkMoving(input, num);
            num ++;
        } return userPosition;
    }

    public int checkMoving(String input, int num) {
        if (realBridge.get(num).equals(input)) {
            userPosition = bridgeGame.move();
            outputView.printMap(num, realBridge, isGameOver);
        }
        if (!realBridge.get(num).equals(input)) {
            isGameOver = true;
            outputView.printMap(num, realBridge, isGameOver);
        } return userPosition;
    }

    public void printResult() {
        outputView.printResult(isGameOver, num);
    }
}
