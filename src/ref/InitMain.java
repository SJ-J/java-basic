package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData initData = new InitData();

        System.out.println(initData.value1);    // 0 출력(초기화하지 않았지만 멤버변수이므로 자동 초기화)
        System.out.println(initData.value2);    // 10 출력(초기값 할당o)

    }
}
