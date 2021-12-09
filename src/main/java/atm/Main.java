package atm;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int amount = scanner.nextInt();
        ATM atm = new ATM(DefaultTrayType.TWENTY, DefaultTrayType.TEN, DefaultTrayType.FIVE);
        atm.process(amount);
    }
}
