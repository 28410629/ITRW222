public class BucketSort {

    public static void bucketSort(int[] arr) {

        // largest value of given array
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }

        // the last index needs to be the value of the largest value in the array
        int[] buckets = new int[m + 1];

        // zero out buckets for increment use
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = 0;
        }

        // traverse through given array and increment bucket (index of buckets array)
        for (int i = 0; i < arr.length; i++) {
            ++buckets[arr[i]];
        }
        
        // recompile sorted array
        for (int i = 0, j = 0; j < buckets.length; j++) {
            for (int k = buckets[j]; k > 0; k--) {
                arr[i++] = j; // i is initialised in first for
            }
        }
    }

    public static void main(String[] args) {
        int[] values = new int[] { 7, 6, 0, 1, 2, 4, 7, 3, 10, 20, 5 };

        System.out.print("Before: ");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        bucketSort(values);

        System.out.print("\nAfter: ");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}