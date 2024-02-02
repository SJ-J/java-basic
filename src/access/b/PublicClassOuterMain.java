package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        // default class(= package class)는 다른 패키지에서 접근 불가
//        DefaultClass1 dc1 = new DefaultClass1();
//        DefaultClass2 dc2 = new DefaultClass2();

    }
}
