package strategyPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class SelectionSort extends Swaps implements SortingAlgo {
    @Override
    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int index = i;
            for(int j = i; j < arr.length; j++) {
                if (arr[index] > arr[j])
                    index = j;

            }
            swap(arr, index, i);
        }
        return arr;
    }
}
