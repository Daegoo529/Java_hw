package streamTest;
import streamTest.common.Product; import java.util.List;
public class Ex09_MatchingTodo {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product(1,"키보드","PC",45000,12), new Product(2,"마우스","PC",25000,0), new Product(3,"텀블러","LIFE",18000,30));
        // TODO 1: 모든 상품의 가격이 1000원 이상인지 검사하세요.
        boolean price1000Up = products.stream()
                .allMatch(product -> product.getPrice() >= 1000);
        System.out.println(" 전체 상품 1000원 이상인지? " + price1000Up);

        // TODO 2: 하나라도 품절 상품이 있는지 검사하세요.
        boolean soldOut = products.stream()
                .anyMatch(product -> product.getStock() == 0 );
        System.out.println("품절 상품이 있는지? " + soldOut);

        // TODO 3: FOOD 카테고리 상품이 하나도 없는지 검사하세요.
        boolean isFoodEmpty = products.stream()
                .noneMatch(product -> product.getCategory().equals("FOOD"));
        System.out.println("FOOD 카테고리 상품이 하나도 없는지?" + isFoodEmpty);
    }
}
