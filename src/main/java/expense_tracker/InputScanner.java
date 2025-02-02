package expense_tracker;

import java.util.Scanner;

public class InputScanner {

    private final Scanner scanner;

    public InputScanner() {
        scanner = new Scanner(System.in);
    }

    public String getPromptInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
