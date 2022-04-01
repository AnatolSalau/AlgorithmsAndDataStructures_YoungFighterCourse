public class Hanoi {


    public void hanoiPrintConsole(int n, int i, int k) {
        if (n == 1) {
            System.out.printf("Move disk 1 from pin %d to %d. \n", i, k);
        }
        else {
            int tmp = 6 - i - k;
            hanoiPrintConsole(n-1, i, tmp);
            System.out.printf("Move disk %d from pin %d to %d. \n",n, i, k);
            hanoiPrintConsole(n-1,tmp,k);
        }
    }

}
