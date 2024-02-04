package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("사과", 14000, 2);
        Item item2 = new Item("커피", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);
    }
}
