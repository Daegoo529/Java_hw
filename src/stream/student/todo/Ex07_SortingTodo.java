package stream.student.todo;



import stream.student.todo.common.Student;

import java.util.Comparator;
import java.util.List;

public class Ex07_SortingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 30),
            new Student("신용권", "남", 10),
            new Student("유미선", "여", 20)
        );

        // 사용자 정의 클래스인 Student를 대상으로 정렬기준
        // comparable 구현되어 있지 않으므로,
        // Comparator를 직접 기준을 제시해 주어야한다.
        // TODO 1: 점수 오름차순 정렬 후 출력
        students.stream()
                .sorted(Comparator.comparing(Student::getScore))
                .forEach(System.out::println);


        // TODO 2: 점수 내림차순 정렬 후 출력
    }
}
