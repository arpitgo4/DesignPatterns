package strategyPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Algorithm {

    private SortingAlgo sortingAlgo = null;

    void sort(int[] arr){
        sortingAlgo.sort(arr);
        for(int i : arr)
            System.out.print(i + ", ");
    }

    public SortingAlgo getSortingAlgo() {
        return sortingAlgo;
    }

    public void setSortingAlgo(SortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }
}
