import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Enter length");
    int length;
    Scanner scanner = new Scanner(System.in);
    length = scanner.nextInt();

    ArrayFilling arrayFilling = new ArrayFilling(length);
    arrayFilling.printArray();
    System.out.printf("\n");
    arrayFilling.arrayFilling();
    arrayFilling.printArray();
    System.out.printf("\n");
    arrayFilling.arrayFillingReverse();
    arrayFilling.printArray();
    }
}
