public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] list = {1, 5, 1, 2, 9, 4, 9, 8};
        System.out.println("Before sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");
        insertionSort.insertionSort(list);
        System.out.println("After sort:");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
