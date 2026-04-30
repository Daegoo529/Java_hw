package streamCodingTest.student.todo;
import codingtest.common.VisitLog; import java.util.*;
/** 코딩테스트 08: seconds가 10 이상인 로그만 디버그 출력하고 총 seconds를 반환하시오. */
public class Ex08_LoopingTodo {
    public static int totalSecondsWithDebug(List<VisitLog> logs) {
        // TODO: filter + peek + mapToInt + sum
        return 0;
    }
    public static void main(String[] args){
        List<VisitLog> logs=Arrays.asList(new VisitLog("U1","/",5),new VisitLog("U2","/cart",20),new VisitLog("U3","/pay",30));
        System.out.println(totalSecondsWithDebug(logs)); // 50
    }
}
