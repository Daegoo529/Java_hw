package java_60_exam.collection.p10;

import java.util.*;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장
        // 이름, 점수 키 사용
        List<Map<String,Object>> list = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("name","김첫째");
        map.put("score",95);
        list.add(map);

        Map<String,Object> map1 = new HashMap<>();
        map1.put("name","김둘째");
        map1.put("score",80);
        list.add(map1);


        // TODO 2: 모든 학생 정보 출력
        for (Map<String,Object> st : list) {
            System.out.println("이름 : "+st.get("name") + "\t점수 : " + st.get("score") );

        }
    }
}
