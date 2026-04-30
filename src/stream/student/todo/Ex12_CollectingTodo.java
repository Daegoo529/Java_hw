package stream.student.todo;

import common.Student;
import java.util.List;

public class Ex12_CollectingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 92),
            new Student("김수영", "여", 87),
            new Student("감자바", "남", 95),
            new Student("오해영", "여", 93)
        );

        // TODO 1: 남학생만 List로 수집
        // TODO 2: 이름을 key, 점수를 value로 Map 수집
        // TODO 3: 성별 기준 groupingBy로 그룹핑
        // TODO 4: 성별 기준 평균 점수 Map을 수집
    }
}
