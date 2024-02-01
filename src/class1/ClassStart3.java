package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // Student 변수 선언
        Student student1;

        // 객체 생성(메모리에 할당)
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 클래스명 객체명 = new 클래스명();
        Student student2 = new Student();   // 붙여서 한번에 가능
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

    }
}
