package additionalQuestions.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 5단계: 커스텀 Iterator 만들기
 *
 * 목표:
 * - 직접 Iterator를 구현하여 재고가 있는 상품만 순회한다.
 */
class Product {
    private final String name;
    private final int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public boolean hasStock() {
        return stock > 0;
    }

    @Override
    public String toString() {
        return name + " / 재고: " + stock;
    }
}

class StockProductIterator implements Iterator<Product> {
    private final List<Product> products;
    private int index = 0;

    public StockProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        while (index < products.size()) {
            if (products.get(index).hasStock()) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Product next() {
        return products.get(index++);
    }
}

public class Step5CustomIterator {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("노트북", 3));
        products.add(new Product("마우스", 0));
        products.add(new Product("키보드", 5));
        products.add(new Product("모니터", 0));

        Iterator<Product> iterator = new StockProductIterator(products);

        System.out.println("재고가 있는 상품 목록");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
