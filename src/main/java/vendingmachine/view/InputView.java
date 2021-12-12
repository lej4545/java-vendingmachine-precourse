package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_VENDING_MACHINE_MONEY_MESSAGE = "자판기가 보유하고 있는 금액을 입력해 주세요.";

    public static String inputVendingMachineMoney() {
        System.out.println(INPUT_VENDING_MACHINE_MONEY_MESSAGE);
        return Console.readLine();
    }
}
