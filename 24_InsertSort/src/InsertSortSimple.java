import java.util.ArrayList;
import java.util.Scanner;

public class InsertSortSimple {
   private ArrayList<Integer> array;
   Scanner scanner;

    public InsertSortSimple () {
        this.array = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void setArray() {
        int number = 1 ;
        while (number !=0) {
            number = scanner.nextInt();
            array.add((Integer) number);
        }

        scanner.close();

        for (int i = 1; i < array.size(); i++) {
            int currentIteration = i;
            while (currentIteration > 0 && array.get(currentIteration-1) > array.get(currentIteration)) {
                Integer tmp = array.get(currentIteration-1);
                array.set(currentIteration-1,array.get(currentIteration));
                array.set(currentIteration,tmp);
                currentIteration--;
            }
        }
    }
    public void printArray() {
        for (Integer val:
             array) {
            System.out.print(val +" ");
        }
    }
}
