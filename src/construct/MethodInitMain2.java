package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member = new MemberInit();

        initMember(member, "user1", 15, 90);
        initMember(member, "user2", 16, 80);

    }

    static void initMember(MemberInit m, String name, int age, int grade) {
        m.name = name;
        m.age = age;
        m.grade = grade;
        System.out.println("이름: " + m.name + " | 나이: " + m.age + " | 성적: " + m.grade);
    }
}
