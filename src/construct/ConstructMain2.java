package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct mc1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct mc2 = new MemberConstruct("user2", 16, 80);
        MemberConstruct mc3 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {mc1, mc2, mc3};

        for (MemberConstruct m : members) {
            System.out.println("생성자 호출 >> name: " + m.name + " | age: " + m.age + " | grade: " + m.grade);
        }

    }
}
