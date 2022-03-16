
public class ReverseArray {
    int[] array;
    public ReverseArray(int length) {
        this.array = new int[length];
    }
    public void setReverseArray () {
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
    public void setArray () {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
    public void getArray () {
        for (int val:array) {
            System.out.printf("%d", val);
        }
    }

}
