public class CheckPrintNumberSplitOnDigits {
    int number;

    public CheckPrintNumberSplitOnDigits(int number) {
        this.number = number;
    }

    public void PrintOddNumbers () {
        while (number !=0) {

            int digit = number % 10;
            if ((digit % 2) == 1) {
                System.out.printf("%d", digit);
            }
            number /=10;
        }
    }
}
