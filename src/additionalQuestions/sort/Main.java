package additionalQuestions.sort;


import additionalQuestions.sort.board.BoardSortExample;
import additionalQuestions.sort.order.OrderSortExample;
import additionalQuestions.sort.product.ProductSortExample;
import additionalQuestions.sort.student.StudentSortExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== 1. Student Comparable / Comparator 예제 =====");
        StudentSortExample.run();

        System.out.println("\n===== 2. Product 현업형 상품 정렬 예제 =====");
        ProductSortExample.run();

        System.out.println("\n===== 3. Board 현업형 게시글 정렬 예제 =====");
        BoardSortExample.run();

        System.out.println("\n===== 4. Order 현업형 주문 정렬 예제 =====");
        OrderSortExample.run();
    }
}
