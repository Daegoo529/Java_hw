package java_60_exam.inheritance.p09;

abstract class MachineTodo {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // TODO 1: work() 추상 메소드 선언
    abstract void work();
}

class ComputerTodo extends MachineTodo {
    // TODO 2: work() 구현
    @Override
    void work() {
        powerOn();
        System.out.println("작업을 합니다.");
        powerOff();
    }

}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ComputerTodo 실행
        ComputerTodo computerTodo = new ComputerTodo();

        computerTodo.work();
    }
}
