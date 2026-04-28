package additionalQuestions.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 3단계: 회원 목록에서 탈퇴 회원 제거
 *
 * 목표:
 * - 객체 리스트에서 조건에 맞는 객체를 삭제한다.
 */
class Member {
    private final String name;
    private final boolean withdrawn;

    public Member(String name, boolean withdrawn) {
        this.name = name;
        this.withdrawn = withdrawn;
    }

    public boolean isWithdrawn() {
        return withdrawn;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Step3MemberIterator {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        members.add(new Member("김철수", false));
        members.add(new Member("이영희", true));
        members.add(new Member("박민수", false));
        members.add(new Member("최지훈", true));

        Iterator<Member> iterator = members.iterator();

        while (iterator.hasNext()) {
            Member member = iterator.next();

            if (member.isWithdrawn()) {
                iterator.remove();
            }
        }

        System.out.println("활성 회원 목록: " + members);
    }
}
