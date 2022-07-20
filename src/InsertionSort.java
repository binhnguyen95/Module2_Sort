public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {152, 16, 16,57, 124, 7,9,63,1,3,5};
        insertionSort(array);

        for (int arr: array) {
            System.out.println(arr);
        }
    }

    public static boolean insertionSort(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while ((pos > 0) && (x < arr[pos - 1])){
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        return true;
    }
}
