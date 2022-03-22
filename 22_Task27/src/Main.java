import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
       * Определить количество пар, для которых произведение элементом делится на 26
       * */
        Scanner scanner = new Scanner(System.in);
        int lengthArr = 10;
        int numberOfEquallyti = 2;
        FirstSolution firstSolution = new FirstSolution(lengthArr);
        firstSolution.printArray();
        System.out.printf("\n");
        System.out.println(firstSolution.searchEqually(numberOfEquallyti));
    }
}
