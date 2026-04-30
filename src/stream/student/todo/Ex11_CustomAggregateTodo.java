package stream.student.todo;

import common.Student;
import java.util.List;

public class Ex11_CustomAggregateTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 92),
            new Student("신용권", "남", 95),
            new Student("감자바", "남", 88)
        );

        // TODO 1: mapToInt + sum으로 점수 합계를 구하세요.
        // TODO 2: map + reduce(0, (a, b) -> a + b)로 점수 합계를 구하세요.
    }
}
