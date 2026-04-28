package java_60_exam.collection.p01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        List<String> arrList = new ArrayList<>();

        // TODO 2: "Java", "Spring", "Vue" 추가
        arrList.add("Java");
        arrList.add("Spring");
        arrList.add("Vue");

        // TODO 3: 전체 요소 출력
        for(String sub : arrList){
            System.out.println(sub);
        }

        Iterator iterator = arrList.iterator();
        while (iterator.hasNext()){
            String result = iterator.next().toString();
            System.out.println(result);
//            System.out.println(iterator.next());
        }
    }
}
