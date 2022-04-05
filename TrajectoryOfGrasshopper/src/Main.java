import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finish = scanner.nextInt();
        scanner.close();
        NumberOfTrajectories numberOfTrajectories = new NumberOfTrajectories();
        System.out.println(numberOfTrajectories.numberOfTrajectories(5));
        System.out.printf("Grasshopper has %d trajectories from 1 to %d",
                numberOfTrajectories.numberOfTrajectories(finish), finish );

    }
}
