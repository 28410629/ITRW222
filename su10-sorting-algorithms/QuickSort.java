public class QuickSort {

    public void quickSort(int[] items, int leftIndex, int rightIndex) {
    
        int i, j, temp, pivotValue, partitionSize;
    
        partitionSize = rightIndex - leftIndex + 1;
    
        if(partitionSize<=1)
            return;
    
        pivotValue = items[(leftIndex + rightIndex)/2];
        i = leftIndex;
        j = rightIndex;

        System.out.println("pivotValue: " + pivotValue + " LI: " + i + " RI:" + j);
     
        do {
            while(items[i]<pivotValue)
                i++;
            while(items[j]>pivotValue)
                j--;
            if(i<=j) {
                System.out.println("Swap: I:" + i + " value: " + items[i] + " J:" + j + " value: " + items[j]); 
                temp = items[i];
                items[i]=items[j];
                items[j]=temp;
                i++;
                j--;
            }
        } while(i<=j);
     
        quickSort(items,leftIndex,j);
        quickSort(items,i,rightIndex);
    }  

    public static void main(String[] args) {
        int[] values = new int[] { 7, 6, 0, 1, 2, 4, 7, 3, 10, 20, 5 };

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        QuickSort qs = new QuickSort();

        qs.quickSort(values, 0, 8);

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}