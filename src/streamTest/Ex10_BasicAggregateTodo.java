package streamTest;
import streamTest.common.Order; import java.util.List;
public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(new Order(1,"홍길동","DONE",30000), new Order(2,"김수영","READY",12000), new Order(3,"오해영","DONE",45000), new Order(4,"강감찬","DONE",22000));
        // TODO: DONE 주문 기준 count, sum, average, max, min을 구하세요.
        long count = orders.stream()
                .filter(order -> order.getStatus().equals("DONE"))
                .count();

        int sum = orders.stream()
                .filter(order -> order.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .sum();

        double avg = orders.stream()
                .filter(order -> order.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .average().orElse(0.0);

        int max = orders.stream()
                .filter(order -> order.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .max().orElse(0);

        int min = orders.stream()
                .filter(order -> order.getStatus().equals("DONE"))
                .mapToInt(Order::getAmount)
                .min().orElse(0);

        System.out.println("DONE 주문 기준");
        System.out.println("count : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("average : %.2f\n" , avg);
        System.out.println("max : " + max);
        System.out.println("min : " + min);

        // TODO: READY 주문 중 첫 번째 주문 금액을 findFirst로 구하세요. 없으면 -1을 출력하세요.
        long findFirst = orders.stream()
                .filter(order -> order.getStatus().equals("READY"))
                .map(Order::getAmount)
                .findFirst().orElse(-1);

        System.out.println("READY 주문 중 첫 번째 주문 금액 : " + findFirst);
    }
}
