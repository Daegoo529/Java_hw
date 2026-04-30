package stream.student.todo;

import java.nio.file.Path;
import java.util.List;

public class Ex04_StreamSourceTodo {
    public static void main(String[] args) throws Exception {
        List<String> names = List.of("A", "B", "C");
        String[] arr = {"홍길동", "신용권", "김미나"};
        Path path = Path.of("src/resources/products.txt");

        // TODO 1: 컬렉션 스트림으로 names 출력
        // TODO 2: 배열 스트림으로 arr 출력
        // TODO 3: IntStream.rangeClosed(1, 5) 출력
        // TODO 4: Files.lines(path)로 파일 내용을 출력하고 리소스를 닫으세요.
    }
}
