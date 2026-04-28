package java_60_exam.inheritance.p08;

class BaseTodo {
    // TODO 1: final showInfo() 작성
    final void showInfo(){
        System.out.println("이건 기본적인 할 일입니다.");
    }
}

class SubTodo extends BaseTodo {
    // TODO 2: extra() 작성
    void extra(){
        System.out.println("이건 부가적으로 할 일입니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: showInfo와 extra 호출

        SubTodo subTodo = new SubTodo();
        subTodo.showInfo();
        subTodo.extra();
    }
}
