package Lambda_exam;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
* Supplier<T> 는 매개변수 없이 값을 생성해서 변환하는 함수형 인터페이스
* 주문번호 자동생성, 임시 비밀번호 생성, 현재 시간 생성, 기본값 지연 생성
 */

public class Ex03SupplierLambdaTodo {
    public static void main(String[] args) {
        // TODO: Supplier<String>을 사용하여 현재 시간을 포함한 주문번호를 생성하세요.
        Supplier<String> orderNoSupplier = () -> "ORDER-" + LocalDateTime.now();

        System.out.println(orderNoSupplier.get());
    }
}
