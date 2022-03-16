public class Main {
    public static void main (String[] args) {
/*    EratosphenSieve eratosphenSieve = new EratosphenSieve(30);
    eratosphenSieve.insertSieveBool();
    eratosphenSieve.printSieveBool();*/

    Check check = new Check(30);
    check.printSieve();

    EratosphenSieve eratosphenSieve = new EratosphenSieve(30);
    eratosphenSieve.insertSieveBool();
    eratosphenSieve.printSieveBool();
    eratosphenSieve.printSieveResult();
    }
}
