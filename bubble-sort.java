public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
