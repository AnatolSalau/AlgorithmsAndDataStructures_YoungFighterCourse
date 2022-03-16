import java.util.ArrayList;
public class EratosphenSieve {

    int length;
    boolean[] sieveBool;
    ArrayList <Integer> sieveResult;

    public EratosphenSieve(int length) {
        this.length = length;
        this.sieveBool = new boolean[length];
        this.sieveResult = new ArrayList<Integer>();
    }

    public void insertSieveBool () {
        for (boolean item : sieveBool) {
            item = false;
        }

        for (int i = 2; i*i < length; i++) {
            if (sieveBool[i] == false) {
                for (int j = i * i; j < length; j += i) {
                    sieveBool[j] = true;
                }
            }
        }
    }

    public void printSieveBool () {
        int count=0;
        for (boolean item : sieveBool) {
            count +=1;
            System.out.printf("%d  ", count);
        }
        System.out.println();
        for (int j = 0; j < sieveBool.length; j++) {
            if (sieveBool[j] == false) {
                System.out.printf("%d  ", j);
                sieveResult.add(j);
            }
        }
    }

    public void printSieveResult () {
        System.out.println("Print " + sieveResult.size() + " elements");
        for (int val:sieveResult) {
            System.out.printf("%d ", val);
        }
    }

}
