public class Main {
    public static void main (String[] args) {
/*    EratosphenSieve eratosphenSieve = new EratosphenSieve(30);
    eratosphenSieve.insertSieveBool();
    eratosphenSieve.printSieveBool();*/

    Check check = new Check(30);
    check.setSieveBool();
    check.printSieveBool();

    Task task = new Task();
    task.findIn();
    task.replace();
    task.print();

    }
}
