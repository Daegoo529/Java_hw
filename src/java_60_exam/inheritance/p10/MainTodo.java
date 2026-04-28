package java_60_exam.inheritance.p10;

class EmployeeTodo {
    void work() {
        System.out.println("직원이 일합니다.");
    }
}

class DeveloperTodo extends EmployeeTodo {
    // TODO 1: work() 오버라이딩

    @Override
    void work() {
        System.out.print("개발자 ");
        super.work();
    }
}

class DesignerTodo extends EmployeeTodo {
    // TODO 2: work() 오버라이딩

    @Override
    void work() {
        System.out.print("디자이너 ");
        super.work();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: EmployeeTodo 배열에 두 객체 저장 후 순회
        EmployeeTodo[] employeeTodos = new EmployeeTodo[2];

        employeeTodos[0] = new DeveloperTodo();
        employeeTodos[1] = new DesignerTodo();

        for(EmployeeTodo E : employeeTodos){
            E.work();
        }
    }
}
