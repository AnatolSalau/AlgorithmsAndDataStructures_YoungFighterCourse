public class Main {

    public static void main(String[] args) {
        int number =3;
        SimpleBinarySearch simpleBinarySearch = new SimpleBinarySearch();
        simpleBinarySearch.createMyArray(5, 0);
        simpleBinarySearch.printArray(simpleBinarySearch.getMyArray());
        System.out.println(simpleBinarySearch.binarySearch(simpleBinarySearch.getMyArray(), number));
        System.out.println(simpleBinarySearch.binarySearch(simpleBinarySearch.getMyArray(), number));
    }
}
