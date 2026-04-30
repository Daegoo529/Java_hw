package streamCodingTest.student.todo;
import codingtest.common.Order; import java.util.*;
/** 코딩테스트 12: PAID 주문만 category별 amount 합계로 수집하시오. */
public class Ex12_CollectingTodo {
    public static Map<String, Integer> salesByCategory(List<Order> orders) {
        // TODO: filter + collect(groupingBy + summingInt)
        return Collections.emptyMap();
    }
    public static void main(String[] args){
        List<Order> orders=Arrays.asList(new Order("O1","C1","BOOK",10000,"PAID"),new Order("O2","C2","FOOD",30000,"PAID"),new Order("O3","C3","BOOK",5000,"PAID"));
        System.out.println(salesByCategory(orders)); // {BOOK=15000, FOOD=30000}
    }
}
