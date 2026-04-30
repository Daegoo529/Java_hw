package streamCodingTest.student.todo;
import java.util.*;
/** 코딩테스트 04: CSV 로그 중 level이 ERROR인 라인의 code만 추출하시오. 형식: time,level,code,message */
public class Ex04_StreamSourceTodo {
    public static List<String> extractErrorCodes(List<String> lines) {
        // TODO: stream, split, filter, map, collect
        return Collections.emptyList();
    }
    public static void main(String[] args){
        List<String> lines=Arrays.asList("09:00,INFO,I001,start","09:01,ERROR,E500,db","09:02,ERROR,E401,auth");
        System.out.println(extractErrorCodes(lines)); // [E500, E401]
    }
}
