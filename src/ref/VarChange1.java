package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 참조형 알아보기
        int a = 10;
        int b = a;
        System.out.println(a + " " +  b);

        a = 20;
        System.out.println(a + " " +  b);

        b = 30;
        System.out.println(a + " " +  b);
    }
}
