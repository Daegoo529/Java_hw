package streamCodingTest.student.todo;

import streamCodingTest.common.Order;

import java.util.*;
/** 코딩테스트 03: status가 PAID인 주문만 대상으로 평균 결제금액을 구하시오. 없으면 0.0 반환. */
public class Ex03_PipelineTodo {
    public static double averagePaidAmount(List<Order> orders) {
        // TODO: filter -> mapToInt -> average -> orElse
        return 0.0;
    }
    public static void main(String[] args){
        List<Order> orders=Arrays.asList(new Order("O1","C1","BOOK",10000,"PAID"),new Order("O2","C2","FOOD",7000,"CANCEL"),new Order("O3","C1","BOOK",30000,"PAID"));
        System.out.println(averagePaidAmount(orders)); // 20000.0
    }
}
