package stream.student.todo;

import java.util.Arrays;

public class Ex09_MatchingTodo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        // TODO 1: 모든 요소가 2의 배수인지 검사
        //  allMatch : 모든 요소가 조건을 만족하는지 검사해서 모두 만족해야만
            boolean allEven = Arrays.stream(arr)
                    .allMatch(n -> n%2 == 0);
        System.out.println("모든 요소가 2의 배수인가요? " + allEven);
        System.out.println("\n");

        // TODO 2: 하나라도 3의 배수가 있는지 검사
        //  anyMatch() : 하나라도 조건을 만족하면 true 반응
            boolean anyMultiOfThree = Arrays.stream(arr)
                    .anyMatch(n -> n%3 == 0);
        System.out.println("하나라도 3의 배수가 있는지 검사 결과 : " + anyMultiOfThree);

        System.out.println();
        // TODO 3: 3의 배수가 하나도 없는지 검사
        boolean noneMatchOfThree = Arrays.stream(arr).noneMatch(n -> n%3 == 0);
        System.out.println("3의 배수가 하나도 없으면 : "+ noneMatchOfThree);
    }
}
