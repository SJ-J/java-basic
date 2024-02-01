package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 이름은 클래스 이름과 같아야 함(대문자로 시작)
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade= grade;
    }
    MemberConstruct(String name, int age) {
        // this를 통해 생성자 내부에서 자신의 생성자를 호출함
        // 생성자 내 첫줄에서만 사용 가능
        this(name, age, 50);
    }
}
