public class Task {
        /*
        для массива из 6 элементов 4 115 7 195 25 106
        найти количества элементов массива больших 100 и кратных 5
        заменить каждый такой элемент на число равное количеству
        Вывести измененный массив
         */
    int[] array;
    int count;
    public Task () {
        this.array = new int[] {
                4, 115, 7, 195, 25, 106
        };
    }

    public int findIn () {
        for (int val: array) {
            if ( (val > 100) & (val % 5 == 0)) {
                count +=1;
            }
        }
        return count;
    }

    public void replace () {
        for (int i=0; i<array.length; i++) {
            if ( (array[i] > 100) && (array[i] % 5 == 0)) {
                array[i] = count;
            }
        }
    }

    public void print () {
        for (int val: array) {
            System.out.printf("%d ", val);
        }
    }
}
