import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InsertSort {
    Set hashset;

    public InsertSort() {
        this.hashset = new HashSet<Integer>();
    }
    public void setHashset(int number) {
        this.hashset.add((Integer) number);
    }
    public void printHashet() {
        System.out.println("hashset hase length " + hashset.size());
        int sum = 0;
        for (Object val:hashset) {
            System.out.print((int)val + " ");
            sum += (int)val;
        }
        System.out.printf("\n");
        System.out.println("hashset sum = " + sum);
    }
    public void insertSort() {

        Integer[] array = (Integer[]) hashset.toArray();
        for (int i = 1; i < array.length; i++) {
            int first =  array[i].intValue();
            int second = array[i-1].intValue();
            int currentPosition =i;

            while (currentPosition>0 && second > first) {

            }

        }

    }

}
