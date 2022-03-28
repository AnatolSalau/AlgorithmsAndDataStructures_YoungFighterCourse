import java.util.Objects;
import java.util.Scanner;

public class Factorial {
    private int number;
    private int result;

    public Factorial() {
    }

    public int getNumber() {
        return number;
    }

    public void printResult() {
        System.out.println("Factorial's result = " +this.result);
    }

    public void setResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = scanner.nextInt();
        this.result = factorial(number);
    }

    private int factorial (int number) {
        if (number == 0) {
            return  1;
        }
        else {
            return factorial(number-1) * number;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factorial factorial = (Factorial) o;
        return number == factorial.number && result == factorial.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, result);
    }
}
