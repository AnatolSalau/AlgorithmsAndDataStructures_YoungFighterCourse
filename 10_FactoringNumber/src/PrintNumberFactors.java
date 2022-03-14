
public class PrintNumberFactors {
    int divisor;
    int number;

    public PrintNumberFactors (int number) {
        // 2 is minimum divisor
        this.divisor =2;
        this.number = number;
    }

    public  void printNumberFactors () {
        while (this.number !=1) {
            while (this.number % this.divisor == 0) {
                System.out.printf("%d ", this.divisor);
                this.number /= this.divisor;
            }
            this.divisor +=1;
        }
    }
}
