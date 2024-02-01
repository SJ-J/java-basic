package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("상품의 구매 수량을 입력해 주세요.");
        int i = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[i];
        for (int j = 0; j <orders.length; j++) {
            System.out.println((j+1) + "번째 주문 정보를 입력해 주세요.");

            System.out.println("상품명: ");
            String productName = sc.nextLine();

            System.out.println("가격: ");
            int price = sc.nextInt();

            System.out.println("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[j] = doOrder(productName, price, quantity);
        }

        printOrder(orders);

    }

    static ProductOrder doOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("[" + order.productName + "(" + order.price + " 원)" + "] 상품의 구매 수량을 입력해 주세요." +
                    "\n (잔여 수량: " + order.quantity + " 개)");
            total += order.price * order.quantity;
        }
        System.out.println("-----------------------------------------------\n" + "총 결제 금액: " + total);
    }
}

/*
출력 예시
상품명: 두부, 가격: 2000, 수량: 2
상품명: 김치, 가격: 5000, 수량: 1
상품명: 콜라, 가격: 1500, 수량: 2
총 결제 금액: 12000
*/
