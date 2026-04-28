package java_60_exam.collection.p03;

import java.util.*;

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

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int result = iterator.next();
            System.out.println(result);
        }

        // TODO + : 정렬하기
        Set<Integer> sortedSet = new TreeSet<>(set);
        // set은 Collections.sort() 를 직접 사용 X
        // 1. list에 담아 sort 하기
        //      List<String> list = new ArrayList<>(set);
        //      Collections.sort(list);
        // 2. TreeSet 사용하기
        //      Set<String> sortedSet = new TreeSet<>(set);
        // 3. Stream API 사용 (Java 8 이상)
        //      List<String> sortedList = set.stream()
        //      .sorted()
        //      .collect(Collectors.toList());
        System.out.println(sortedSet);
        for(int item : sortedSet){
            System.out.println(item);
        }



    }
}
