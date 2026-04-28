package java_60_exam.inheritance.p04;

class TireTodo {
    // TODO 1: roll() 작성
    void roll(){}
}

class SnowTireTodo extends TireTodo {
    // TODO 2: roll() 오버라이딩


    @Override
    void roll() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: SnowTireTodo 객체를 TireTodo 변수에 대입 후 roll 호출
        TireTodo tire = new SnowTireTodo();

        tire.roll();
    }
}
