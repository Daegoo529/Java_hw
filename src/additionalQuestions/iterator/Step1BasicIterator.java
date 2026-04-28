package additionalQuestions.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1단계: Iterator 기본 사용
 *
 * 목표:
 * - List 데이터를 Iterator로 순회한다.
 * - hasNext(), next()의 역할을 이해한다.
 */
public class Step1BasicIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("김철수");
        names.add("이영희");
        names.add("박민수");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
