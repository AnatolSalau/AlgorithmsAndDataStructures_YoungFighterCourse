public class CheckPrintNumberFactors {
    int number;
    int divisor;

    public CheckPrintNumberFactors(int number) {
        this.number = number;
        this.divisor = 2;
    }

    public void printNumberFactor () {
        while (this.number != 1) {
            while (this.number % this.divisor == 0) {
                System.out.printf("%d ", this.divisor);
                this.number /= this.divisor;
            }
            this.divisor +=1;
        }
    }
}
