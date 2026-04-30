package streamCodingTest.student.todo;
import java.util.*;
/** 코딩테스트 09: 모든 점검 항목이 "OK"이고, "BLOCK" 항목이 하나도 없을 때만 true 반환. */
public class Ex09_MatchingTodo {
    public static boolean canDeploy(List<String> checks) {
        // TODO: allMatch와 noneMatch 사용
        return false;
    }
    public static void main(String[] args){
        System.out.println(canDeploy(Arrays.asList("OK","OK","OK"))); // true
        System.out.println(canDeploy(Arrays.asList("OK","BLOCK"))); // false
    }
}
