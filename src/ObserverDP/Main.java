package ObserverDP;

/**
 * Created by arpit on 31/1/16.
 */
public class Main {

    public static void main(String[] args){
        StockMarket market = new StockMarket();

        StockHolder holder1 = new StockHolder("Arpit");
        StockHolder holder2 = new StockHolder("Akash");
        StockHolder holder3 = new StockHolder("Parth");
        StockHolder holder4 = new StockHolder("Priya");

        market.registerInMarket(holder1);
        market.registerInMarket(holder2);
        market.registerInMarket(holder3);
        market.registerInMarket(holder4);

        market.changeStockValue(new Stock("google", 10.0f));

        market.unregisterFromMarket(holder2);

        market.changeStockValue(new Stock("xiaomi", 10.0f));
    }

}
