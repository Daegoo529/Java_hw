package java_60_exam.inheritance.p01;

class ParentTodo {
    // TODO 1: name 필드 선언
    String name;
}

class ChildTodo extends ParentTodo {
    // TODO 2: age 필드 선언
    int age;


}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체를 생성하고 부모/자식 필드 출력
        ChildTodo childTodo = new ChildTodo();

        childTodo.age = 25;
        childTodo.name = "홍길동";

        System.out.println(childTodo.name + "의 나이는 "+childTodo.age + "입니다.");
    }
}
