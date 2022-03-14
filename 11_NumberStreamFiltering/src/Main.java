import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

	    PrintNumberSplitOnDigits printNumberSplitOnDigits = new PrintNumberSplitOnDigits(number);
        printNumberSplitOnDigits.printNumberSplitOnDigits();
        System.out.printf("\n");
        CheckPrintNumberSplitOnDigits checkPrintNumberSplitOnDigits = new CheckPrintNumberSplitOnDigits(number);
        checkPrintNumberSplitOnDigits.PrintOddNumbers();
    }
}
