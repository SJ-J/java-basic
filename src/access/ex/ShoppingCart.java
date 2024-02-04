package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if ( items.length > itemCount ) {
            items[itemCount++] = item;

            System.out.println("현재 장바구니 상품 수: " + itemCount + " 개");
            showCart();
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
            showCart();
        }
    }
    public void showCart() {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getProductName()
                    + "(" + item.getTotalPrice() + " 원)");
        }
        System.out.println("총 " + calcTotalPrice() + " 원");
    }
    private int calcTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
