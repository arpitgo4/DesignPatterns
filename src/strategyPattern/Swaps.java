package strategyPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Swaps {

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
