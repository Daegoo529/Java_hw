package streamCodingTest.student.todo;
import streamCodingTest.common.Order; import java.util.*;
/** 코딩테스트 13: 대량 주문에서 PAID 상태의 amount 합계를 parallelStream으로 계산하시오. */
public class Ex13_ParallelTodo {
    public static long parallelPaidTotal(List<Order> orders) {
        // TODO: parallelStream + filter + mapToLong + sum
        return 0L;
    }
    public static void main(String[] args){
        List<Order> orders=new ArrayList<>(); for(int i=1;i<=1000;i++) orders.add(new Order("O"+i,"C"+i,"ETC",100,"PAID"));
        System.out.println(parallelPaidTotal(orders)); // 100000
    }
}
