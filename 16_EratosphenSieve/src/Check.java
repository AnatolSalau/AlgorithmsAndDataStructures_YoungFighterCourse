public class Check {
    boolean[] sieveBool;

    int length;
    public Check (int length) {
        this.length = length;
        this.sieveBool = new boolean[length];

        for (boolean val: sieveBool) {
            val = false;
        }
    }

    public void setSieveBool () {
        for (int i = 2; i*i < length; i++) {
            if (sieveBool[i] == false) {
                for (int j = i*i; j <length ; j+=i) {
                    sieveBool[j] = true;
                }
            }
        }
    }

    public void printSieveBool () {
        for (int i = 2; i < length; i++) {
            if (sieveBool[i] == false) System.out.printf("%d ", i);
        }
    }

}
