package Shop;

import java.util.HashMap;

public class MarketManager {
    private HashMap<String, Market> listOfMarkets;

    public MarketManager() {
        listOfMarkets = new HashMap<>();
    }

    public void addMarket(String name) {
        listOfMarkets.put(name, new Market(name));
    }

    public void supplyProducts(String marketName, String type, int count, double price) {
        Market market = listOfMarkets.get(marketName);
        if (market != null) {
            market.supply(type, count, price);
        } else {
            System.out.println("Магазин " + marketName + " не существует");
        }
    }

    public int getProductsAmount(String marketName, String type) {

        Market market = listOfMarkets.get(marketName);
        if (market != null) {
            return market.getProductAmount(type);
        } else {
            System.out.println("Магазин " + marketName + " не существует");
            return -1;
        }
    }

    public void listsMarkets() {
        for (String marketName : listOfMarkets.keySet()) {
            System.out.println(marketName);
        }
    }
}
