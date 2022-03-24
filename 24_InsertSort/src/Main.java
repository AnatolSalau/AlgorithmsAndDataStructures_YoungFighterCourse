import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertSort insertSort = new InsertSort();

        while (true) {
        int val = scanner.nextInt();
        if (val == 0) break;
        else insertSort.setHashset(val);
        }
        insertSort.printHashet();
    }
}
