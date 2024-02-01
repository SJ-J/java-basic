package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = doOrder("신해량의 뜨개 양말", 2000, 5);
        orders[1] = doOrder("서지혁의 돗대", 80000, 1);
        orders[2] = doOrder("백애영의 액세서리(?)", 6000, 2);

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
        Scanner sc = new Scanner(System.in);
        for (ProductOrder order : orders) {
            System.out.println("[" + order.productName + "(" + order.price + " 원)" + "] 상품의 구매 수량을 입력해 주세요." +
                    "\n (잔여 수량: " + order.quantity + " 개)");
            order.quantity = sc.nextInt();
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
