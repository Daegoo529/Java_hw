package streamCodingTest.student.todo;

import streamCodingTest.common.Order;
import java.util.*;
/** 코딩테스트 05: 중복 주문번호를 제거하고, status가 CANCEL인 주문번호만 반환하시오. */
public class Ex05_FilteringTodo {
    public static List<String> uniqueCanceledOrderIds(List<Order> orders) {
        // TODO: filter, map, distinct, collect
        return Collections.emptyList();
    }
    public static void main(String[] args){
        List<Order> orders=Arrays.asList(new Order("O1","C1","BOOK",10000,"CANCEL"),new Order("O1","C1","BOOK",10000,"CANCEL"),new Order("O2","C2","FOOD",7000,"PAID"));
        System.out.println(uniqueCanceledOrderIds(orders)); // [O1]
    }
}
