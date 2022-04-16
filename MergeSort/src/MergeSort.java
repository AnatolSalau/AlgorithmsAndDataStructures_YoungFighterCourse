import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] array) {

        int length = array.length;
        if (length <=1) {
            return array; // возврат в рекурсию в строки ниже см комменты.
        }
        int[] left;
        int[] right;
//        Создаем две массива в зависимости четная длина или нет
        if (length % 2 == 0) {
            left = new int[length / 2];
            right = new int[length / 2];
        } else {
            left = new int[length / 2];
            right = new int[(length / 2) + 1];
        }
//        Заполняем созданные массивы
        for (int i = 0; i < left.length ; i++) {left[i] = array[i];}
        for (int i = 0; i < right.length ; i++) {right[i] = array[i+length/2];}
        System.out.println("left after separate: " + Arrays.toString(left));
        System.out.println("Right after separate: " + Arrays.toString(right));
        System.out.println("_________");
        mergeSort(left);
        mergeSort(right);
        System.out.println("left recurrent: " + Arrays.toString(left));
        System.out.println("right recurrent: " + Arrays.toString(right));
        mergeSortedVectors(left,right,array);
        System.out.println("array recurrent:" + Arrays.toString(array));
        return array;
    }
//    Алгоритм слияния двух массивов в один с сортировкой
    public void mergeSortedVectors(int[] left, int[] right, int[] array) {
        int i = 0,
            k = 0,
            n = 0;
        while (i < left.length  && k < right.length) {
            if (left[i] <= right[k]) {
                array[n] = left[i];
                n +=1;
                i +=1;
            }
            else {
                array[n] = right[k];
                n +=1;
                k +=1;
            }
        }
        while (i < left.length) {
            array[n] = left[i];
            n +=1;
            i +=1;
        }
        while (k < right.length) {
            array[n] = right[k];
            k +=1;
            n +=1;
        }
    }
}
