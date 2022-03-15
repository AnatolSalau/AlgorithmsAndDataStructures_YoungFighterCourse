public class ArrayFilling {
    int length;
    int[] array;

    public ArrayFilling(int length) {
        this.length = length;
         this.array = new int[length];
    }
    public void arrayFilling () {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public void arrayFillingReverse () {
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length-i-1;
        }
    }

    public void arrayFillingThroughtOne() {

    }

    public void printArray () {
        for (int number:
             array) {
            System.out.printf("%d", number);
        }
    }
}
