package oop_exam.p01;

public class StudentMainTodo {
    public static void main(String[] args) {
        // TODO 1: StudentTodo 객체를 2개 생성하세요.
        StudentTodo student1;
        StudentTodo student2;

        // TODO 2: 첫 번째 객체에 다음 데이터를 저장하세요.
        // 이름 = "김민지", 학번 = "2026001", 학년 = 1
        student1 = new StudentTodo("김민지","2026001",1);

        // TODO 3: 두 번째 객체에 다음 데이터를 저장하세요.
        // 이름 = "이서준", 학번 = "2026002", 학년 = 2
        student2 = new StudentTodo("이서준","2026002",2);

        // TODO 4: 두 객체의 printInfo() 메소드를 각각 호출하세요.
        student1.printInfo();
        student2.printInfo();
    }
}
