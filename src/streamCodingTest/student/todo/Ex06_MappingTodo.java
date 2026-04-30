package streamCodingTest.student.todo;
import streamCodingTest.common.Product;
import java.util.*;
/** 코딩테스트 06: 상품을 "SKU|상품명|가격원" 형식의 카드 문자열로 변환하시오. */
public class Ex06_MappingTodo {
    public static List<String> toProductCards(List<Product> products) {
        // TODO: map으로 Product를 String으로 변환
        return Collections.emptyList();
    }
    public static void main(String[] args){
        List<Product> products=Arrays.asList(new Product("P1","Keyboard",30000,5),new Product("P2","Mouse",15000,0));
        System.out.println(toProductCards(products)); // [P1|Keyboard|30000원, P2|Mouse|15000원]
    }
}
