package Shop;
import java.util.HashMap;

public class Market {
    private HashMap<String, Container> listOfContainers;
    private String name;
    private double profit;

    public Market(String name) {
        this.name = name;
        listOfContainers = new HashMap<>();
    }

    public void supply(String type, int amount, double price) {
        Container product = listOfContainers.get(type);
        if (product != null) {
            product.setCount(product.getCount() + amount);
        } else {
            listOfContainers.put(type, new Container(type, amount, price));
        }
    }

    public int getProductAmount(String type) {
        Container container = listOfContainers.get(type);
        if (container != null) {
            return listOfContainers.get(type).getCount();
        } else {
            System.out.println("Продукт " + type + " не существует");
            return 0;
        }
    }

    public void setName(String name) { this.name = name; }

    public void setProfit(double profit) { this.profit = profit; }

    public String getName() { return name; }

    public double getProfit() { return profit; }
}
