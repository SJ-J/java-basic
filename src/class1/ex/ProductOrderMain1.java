package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        // 첫 번재 상품 주문 정보
        ProductOrder po1 = new ProductOrder();
        po1.productName = "신해량의 뜨개 양말";
        po1.price = 2000;
        po1.quantity = 5;

        // 두 번재 상품 주문 정보
        ProductOrder po2 = new ProductOrder();
        po2.productName = "서지혁의 돗대";
        po2.price = 80000;
        po2.quantity = 1;

        // 세 번째 상품 주문 정보
        ProductOrder po3 = new ProductOrder();
        po3.productName = "백애영의 액세서리(?)";
        po3.price = 6000;
        po3.quantity = 2;

        ProductOrder[] pos = {po1, po2, po3};

        // 주문 정보와 최종 금액(최종 금액 = 가격 * 수량)
        int total = 0;
        for (ProductOrder po : pos) {
            System.out.println("상품명: " + po.productName + " | 가격: " + po.price + " | 수량: " + po.quantity);
            total = po.price * po.quantity;
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
