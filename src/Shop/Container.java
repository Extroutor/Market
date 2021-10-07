package Shop;

public class Container {
    final private String type;
    private int count;
    private double price;

    public Container(String type, int count, double price) {
        this.count = count;
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
