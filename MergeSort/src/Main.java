import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,8,3,7,6,10,2,4,5,2,2,3,3};

        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.mergeSort(array)));
    }
}
