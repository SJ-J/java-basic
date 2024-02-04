package access.ex;

public class Item {
    private String product;
    private int price;
    private int quantity;

    public Item(String product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
    public String getProductName() {
        return product;
    }
    public int getTotalPrice() {
        return price * quantity;
    }
}
