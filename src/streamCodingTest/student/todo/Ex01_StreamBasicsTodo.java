package streamCodingTest.student.todo;

import streamCodingTest.common.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 코딩테스트 01: users에서 active=true인 사용자 이름만 입력 순서대로 반환하시오. */
public class Ex01_StreamBasicsTodo {
    public static List<String> activeNames(List<User> users) {
        // TODO: stream, filter, map, collect 사용
        return Collections.emptyList();
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("U1","Kim",24,true), new User("U2","Lee",31,false), new User("U3","Park",28,true));
        System.out.println(activeNames(users)); // [Kim, Park]
    }
}
