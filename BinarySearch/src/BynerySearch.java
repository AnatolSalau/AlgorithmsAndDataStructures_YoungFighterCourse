import java.util.Arrays;

public class BynerySearch {
    private int[] myArray;

    public int[] getMyArray() {
        return myArray;
    }

    public void createMyArray(int length, int startNumber) {
        myArray = new int[length];
        for (int i = startNumber; i < myArray.length; i++) {
            myArray[i] = i;
        }
    }

    public void printArray(int[] myArray) {
        System.out.println(Arrays.toString(myArray));
    }

    public int leftBoundaryArray(int number,int[] myArray) {
        int left = -1;
        int right = myArray.length;

        while (right - left >1) {
            int midle = (left+right)/2;
            if (myArray[midle] < number) {left = midle;}
            else {right = midle;}
        }
        return left;
    }

    public int rightBoundaryArray(int number,int[] myArray) {
        int left = -1;
        int right = myArray.length;

        while (right - left >1) {
            int midle = (left+right)/2;
            if (myArray[midle] <= number) {left = midle;}
            else {right = midle;}
        }
        return right;

    }

}



