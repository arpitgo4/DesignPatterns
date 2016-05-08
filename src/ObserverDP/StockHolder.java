package ObserverDP;

/**
 * Created by arpit on 31/1/16.
 */
public class StockHolder implements StockChangeListener {

    private String name;

    public StockHolder(String name) {
        this.name = name;
    }

    @Override
    public void onStockChange(Stock stock) {
        System.out.println("StockHolder : " + getName()
                + " value of " + stock.getName() + " is changed to "
                + stock.getValue() + ".");
    }

    public String getName() {
        return name;
    }

}
