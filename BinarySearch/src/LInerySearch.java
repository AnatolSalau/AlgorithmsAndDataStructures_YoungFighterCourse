import java.util.Arrays;

public class LInerySearch {
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
        while (left < myArray.length && number > myArray[left+1]) {
            left +=1;
        }
        return left;
    }

    public int rightBoundaryArray(int number,int[] myArray) {
        int right = myArray.length;
        while (right > 0 && number < myArray[right-1]) {
            right -=1;
        }
        return right;
    }

}



