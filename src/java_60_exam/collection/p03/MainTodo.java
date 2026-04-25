package java_60_exam.collection.p03;

import java.util.HashSet;
import java.util.Set;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Set<Integer> 생성
        Set<Integer> set = new HashSet<>();

        // TODO 2: 10, 20, 10, 30 추가
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        // TODO 3: 크기와 요소 출력
        System.out.println("set의 크기 : "+set.toArray().length);
        for(int num : set){
            System.out.println(num);
        }
    }
}
