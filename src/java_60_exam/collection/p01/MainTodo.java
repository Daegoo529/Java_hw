package java_60_exam.collection.p01;

import java.util.Arrays;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        List<String> arrList;

        // TODO 2: "Java", "Spring", "Vue" 추가
        arrList = Arrays.asList("Java","Spring","Vue");

        // TODO 3: 전체 요소 출력
        for(String sub : arrList){
            System.out.println(sub);
        }
    }
}
