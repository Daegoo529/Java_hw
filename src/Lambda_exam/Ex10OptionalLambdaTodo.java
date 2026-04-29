package Lambda_exam;

import java.util.Optional;

/*
* Optional<T> null 알 수 있는 값을 안전하게 다루기 위한 컨테이너이다
* ofNullable() 값이 null이어도 안전하게 Optional 객체를 생성하여 처리한다.
* orElse() 값이 없을때 사용할 기본값을 지정 할 수 있다.
 */


public class Ex10OptionalLambdaTodo {
    public static void main(String[] args) {
        // email 값이 null 이 아니면 람다식을 실행하고 null이면 기본 문자열을 반환
        String email = "sym@g.com";

        // TODO: Optional과 람다를 사용하여 email이 null이면 "이메일 없음"을 출력하세요.
        String result = Optional.ofNullable(email).map(value -> "이메일 : " + value)
                        .orElse("이메일 없음");

        System.out.println(result);
    }
}
