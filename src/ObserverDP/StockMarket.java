package ObserverDP;

import java.util.Vector;

/**
 * Created by arpit on 31/1/16.
 */
public class StockMarket {

    private String[] stockNames = {
        "facebook", "google", "microsoft", "apple",
            "xiaomi", "samsung", "oxyent"
    };
    private float[] stockValues = {
        5.0f, 7.0f, 8.0f, 9.0f, 6.0f, 2.0f, 1.0f
    };

    private Vector<Stock> stocks = new Vector<>();

    private Vector<StockHolder> stockHolders = new Vector<>();

    public StockMarket() {
        for(int i = 0; i < stockNames.length; i++)
            stocks.add(new Stock(stockNames[i], stockValues[i]));
    }

    public void registerInMarket(StockHolder stockHolder){
        stockHolders.add(stockHolder);
    }

    public void unregisterFromMarket(StockHolder stockHolder){
        if(stockHolders.contains(stockHolder))
            stockHolders.remove(stockHolder);
    }

    public void changeStockValue(Stock stock){
        for(Stock s : stocks){
            if(s.equals(stock))
                System.out.println(stock.getName() + "'s value changed from " +
                    s.getValue() + " to " + stock.getValue());
        }
        informAllStockHolders(stock);
    }

    private void informAllStockHolders(Stock stock){
        for(StockHolder stockHolder : stockHolders){
            stockHolder.onStockChange(stock);
        }
    }

}
