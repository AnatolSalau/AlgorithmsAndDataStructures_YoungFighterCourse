public class NumberOfTrajectories {
    public int numberOfTrajectories (int number) {
        int[] K = new int[number+1];
        K[0] = 0;
        K[1] = 1;
        for (int i = 2; i <= number; i++) {
            K[i] = K[i-1] + K[i-2];
        }
        return K[number];
    }
}
