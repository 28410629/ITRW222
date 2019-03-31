public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int k;

        for (int m = arr.length; m >= 0; m--) {

            for (int i = 0; i < arr.length - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
  
    public static void main(String[] args) {
        int[] values = new int[] { 7, 6, 0, 1, 2, 4, 7, 3, 10, 20, 5 };

        System.out.print("Before: ");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        bubbleSort(values);

        System.out.print("\nAfter: ");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}