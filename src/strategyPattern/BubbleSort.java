package strategyPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class BubbleSort extends Swaps implements SortingAlgo {

    @Override
    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            for(int j = i; j < arr.length-1; j++){
                if(arr[i] > arr[j+1])
                    swap(arr, i, j);

            }
        return arr;
    }
}
