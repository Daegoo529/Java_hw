package java_60_exam.collection.p05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainTodo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // TODO 1: entrySet()을 이용해 key=value 형태로 출력
//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
