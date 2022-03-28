import java.util.Scanner;
public class CounterSort {
    public static  int[] counter = new int[8];
    public static int x;
    public static int terminator = 10;

    public static void setCounter () {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < counter.length; i++) {
            x = scanner.nextInt();
            if (x == terminator) break;
            if (x < 0 && x > 8) continue;
            counter[x] +=1;
        }
            scanner.close();
    }
    public static void check() {
        for (int val:
             counter) {
            System.out.printf("%d ", val);
        }
    }
    public static void print() {
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i]; j++) {
                System.out.printf("%d ", i);
            }
        }
    }

}
