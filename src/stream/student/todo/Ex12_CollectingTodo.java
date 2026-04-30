package stream.student.todo;


import stream.student.todo.common.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12_CollectingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 92),
            new Student("김수영", "여", 87),
            new Student("감자바", "남", 95),
            new Student("오해영", "여", 93)
        );

        // TODO 1: 남학생만 List로 수집
        List<Student> maleStudent = students.stream().filter(sex -> sex.getSex().equals("남")).toList();

        // TODO 2: 이름을 key, 점수를 value로 Map 수집
        Map<String,Integer> scoreMap = students.stream().collect(Collectors.toMap(Student::getName, Student :: getScore));

        // TODO 3: 성별 기준 groupingBy로 그룹핑
        Map<String, List<Student>> bySex = students.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        // TODO 4: 성별 기준 평균 점수 Map을 수집
        Map<String, Double> avgSex = students.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));

        System.out.println("Todo 1 : " + maleStudent);
        System.out.println("Todo 2 : " + scoreMap);
        System.out.println("Todo 3 : " + bySex);
        System.out.println("Todo 4 : " + avgSex);

    }
}
