import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter number");
        int number;
        number = scanner.nextInt();

        PrintNumberFactors printNumberFactors = new PrintNumberFactors(number);
        printNumberFactors.printNumberFactors();

        System.out.printf("\n");

        CheckPrintNumberFactors checkPrintNumberFactors = new CheckPrintNumberFactors(number);
        checkPrintNumberFactors.printNumberFactor();


    }
}
