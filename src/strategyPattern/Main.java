package strategyPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Main {

    public static void main(String[] args){
        int[] arr = {
                9,8,7,6,5,4,3,2,1
        };

        Algorithm algo = new Algorithm();
        algo.setSortingAlgo(new SelectionSort());
        System.out.println("Using " + algo.getSortingAlgo());
        algo.sort(arr);

        System.out.println();

        algo.setSortingAlgo(new BubbleSort());
        System.out.println("Using " + algo.getSortingAlgo());
        algo.sort(arr);

    }
}
