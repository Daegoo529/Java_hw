package additionalQuestions.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 4단계: 주문 목록에서 취소 주문 제거
 *
 * 목표:
 * - 주문 상태를 기준으로 처리 가능한 주문만 남긴다.
 */
class Order {
    private final Long orderId;
    private final String status;

    public Order(Long orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    public boolean isCanceled() {
        return status.equals("CANCELED");
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", status='" + status + "'}";
    }
}

public class Step4OrderIterator {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1L, "PAID"));
        orders.add(new Order(2L, "CANCELED"));
        orders.add(new Order(3L, "READY"));
        orders.add(new Order(4L, "CANCELED"));

        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();

            if (order.isCanceled()) {
                iterator.remove();
            }
        }

        System.out.println("처리 가능한 주문 목록");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
