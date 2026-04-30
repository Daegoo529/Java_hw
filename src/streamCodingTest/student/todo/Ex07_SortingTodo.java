package streamCodingTest.student.todo;
import codingtest.common.Product; import java.util.*;
/** 코딩테스트 07: stock이 5 미만인 상품만 price 내림차순, price가 같으면 sku 오름차순으로 정렬하여 sku 목록 반환. */
public class Ex07_SortingTodo {
    public static List<String> sortLowStockProducts(List<Product> products) {
        // TODO: filter + sorted(Comparator...) + map + collect
        return Collections.emptyList();
    }
    public static void main(String[] args){
        List<Product> products=Arrays.asList(new Product("P3","A",20000,3),new Product("P1","B",30000,2),new Product("P2","C",30000,1),new Product("P4","D",1000,10));
        System.out.println(sortLowStockProducts(products)); // [P1, P2, P3]
    }
}
