package bridge.view;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    private static String up1 = "[ ";
    private static String up2 = " ]";
    public static String down1 = "[ ";
    private static String down2 = " ]";
    private static String finalUp = "";
    private static String finalDown = "";

    public void printBridgeSizeInputText() {
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public void printUserChoiceInputText() {
        System.out.println();
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(int point, boolean isGameOver, String input) {
        if (point >= 1) {
            up1 += " | ";
            down1 += " | ";
        }
        if (!isGameOver && input.equals("U")) {
            up1 += "O";
            down1 += " ";
        }
        if (!isGameOver && input.equals("D")) {
            down1 += "O";
            up1 += " ";
        }
        if (isGameOver && input.equals("U")) {
            up1 += "X";
            down1 += " ";
        }
        if (isGameOver && input.equals("D")) {
            down1 += "X";
            up1 += " ";
        }
        System.out.println(up1 + up2);
        System.out.println(down1 + down2);
        finalUp = up1 + up2;
        finalDown = down1 + down2;
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(boolean isGameOver, int point) {
        System.out.println();
        System.out.println("최종 게임 결과");
        System.out.println(finalUp);
        System.out.println(finalDown);
        System.out.println();

        if (isGameOver) {
            System.out.println("게임 성공 여부: 실패");
        }
        if (!isGameOver) {
            System.out.println("게임 성공 여부: 성공");
        }
        System.out.println("총 시도한 횟수: " + point);
    }

    public void askForAnotherGame() {
        System.out.println();
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }

    public void setUpDown() {
        up1 = "[ ";
        up2 = " ]";
        down1 = "[ ";
        down2 = " ]";
        finalUp = "";
        finalDown = "";
    }
}
