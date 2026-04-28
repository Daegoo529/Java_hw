package additionalQuestions.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2단계: 조건에 맞는 데이터 삭제
 *
 * 목표:
 * - 반복 중 Iterator.remove()를 사용하여 안전하게 데이터를 삭제한다.
 */
public class Step2RemoveData {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        users.add("admin");
        users.add("user1");
        users.add("test");
        users.add("user2");

        Iterator<String> iterator = users.iterator();

        while (iterator.hasNext()) {
            String user = iterator.next();

            if (user.equals("test")) {
                iterator.remove();
            }
        }

        System.out.println("삭제 후 사용자 목록: " + users);
    }
}
