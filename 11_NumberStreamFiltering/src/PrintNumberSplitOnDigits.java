public class PrintNumberSplitOnDigits {
    int number;

    public PrintNumberSplitOnDigits(int number) {
        this.number = number;
    }

    public void printNumberSplitOnDigits () {
        while (number !=0) {
            int digit = number%10;
            System.out.printf("%d", digit);
            number /=10;
        }
    }

}
