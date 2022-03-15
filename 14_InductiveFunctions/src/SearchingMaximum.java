import java.util.Scanner;

public class SearchingMaximum {
    int max;
    int countOfMAx;
    Scanner scanner;

    public SearchingMaximum () {
        this.scanner = new Scanner(System.in);
        this.countOfMAx =1;
    }

    public void getMaxFromInt () {
        System.out.println("Enter number, 0 is stop loop");
        while (true) {
            int current = scanner.nextInt();
            if (current == 0) {
                break;
            }
            else if (current == max) {
                countOfMAx +=1;
            }
            else if (current > max) {
                max = current;
            }
        }
        System.out.println("Max is " + max + " Count of max = " +countOfMAx);
    }
}
