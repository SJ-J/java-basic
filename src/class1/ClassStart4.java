package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // Student 변수 선언
        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 클래스명 객체명 = new 클래스명();
        Student student2 = new Student();   // 붙여서 한번에 가능
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열 생성
        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;


        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    }
}
