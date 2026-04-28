package java_60_exam.inheritance.p02;

class ParentTodo {
    String name;

    // TODO 1: ParentTodo(String name) 생성자 작성
    ParentTodo(String name){
        this.name = name;
    }
}

class ChildTodo extends ParentTodo {
    int age;

    // TODO 2: ChildTodo(String name, int age) 생성자 작성
    // super(name) 사용
    ChildTodo(String name, int age){
        super(name);
        this.age = age;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체 생성 및 출력
        ChildTodo childTodo = new ChildTodo("홍길동",25);

        System.out.println(childTodo.name + "의 나이는 "+childTodo.age + "입니다.");
    }
}
