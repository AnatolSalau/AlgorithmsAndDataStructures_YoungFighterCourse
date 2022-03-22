import java.util.Random;

public class FirstSolution {
    Random random;
    int[] arr;
    int length;

    public FirstSolution (int length) {
        this.length = length;
        this.random = new Random();
        this.arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(26);
        }
    }

    public int searchEqually(int number) {
        int quantityEqually = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] * arr[j] % number == 0) {
                    quantityEqually +=1;
                }
            }
        }
        return quantityEqually;
    }

    public void printArray () {
        for (int val:arr) {
            System.out.printf("%d ",val);
        }
    }


}
