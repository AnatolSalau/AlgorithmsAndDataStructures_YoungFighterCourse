import java.util.Arrays;

public class SimpleBinarySearch {
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

    public int binarySearch(int[] array, int element) {
        int startIndex = 0;
        int finishIndex = array.length;
        int resultIndex = -1;

        while (startIndex <=finishIndex) {
            int middleIndex = (startIndex + finishIndex) / 2;
            // Если средний элемент искомый - возвращаем его индекс
            if (element == array[middleIndex]) {
                resultIndex = middleIndex;
                break;
            }
            //если средний элемент меньше искомого убираем первую часть из рассмотрения
            else if (element > array[middleIndex]) {
                startIndex = middleIndex +1;
            }
            //если средний элемент больше искомого убираем последнюю часть из рассмотрения
            else if (element < array[middleIndex]) {
                finishIndex = middleIndex -1;
            }
        }
        return resultIndex;
    }

}
