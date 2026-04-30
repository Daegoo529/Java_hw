package streamCodingTest.student.todo;
import streamCodingTest.common.Order; import java.util.*;
/** 코딩테스트 10: PAID 주문 기준으로 "count=개수,sum=합계,max=최대값" 문자열을 반환하시오. 없으면 max=0. */
public class Ex10_BasicAggregateTodo {
    public static String amountSummary(List<Order> orders) {
        // TODO: summaryStatistics 또는 count/sum/max 사용
        return "";
    }
    public static void main(String[] args){
        List<Order> orders=Arrays.asList(new Order("O1","C1","BOOK",10000,"PAID"),new Order("O2","C2","FOOD",30000,"PAID"),new Order("O3","C3","BOOK",5000,"CANCEL"));
        System.out.println(amountSummary(orders)); // count=2,sum=40000,max=30000
    }
}
