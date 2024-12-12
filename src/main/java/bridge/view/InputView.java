package bridge.view;

import bridge.view.validation.BridgeSizeValidator;
import bridge.view.validation.UserChoiceValidator;
import camp.nextstep.edu.missionutils.Console;
import java.util.Scanner;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    Scanner scanner = new Scanner(System.in);

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
//        String bridgeSize = Console.readLine(); 예전 과제 버전 문제로 스캐너 사용
        String bridgeSize = scanner.next();
        BridgeSizeValidator.validator(bridgeSize);
        return Integer.parseInt(bridgeSize);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
//        String userChoice = Console.readLine();
        String userChoice = scanner.next();
        UserChoiceValidator.validator(userChoice);
        return userChoice;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
