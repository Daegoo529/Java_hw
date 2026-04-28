package java_60_exam.collection.p06;

import java.util.Iterator;
import java.util.Stack;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Stack<String> 생성
        Stack<String> stack = new Stack<>();

        // TODO 2: "첫째", "둘째", "셋째" push
        stack.push("첫째");
        stack.push("둘째");
        stack.push("셋째");

        // TODO 3: pop 하며 출력
//        System.out.println("stack 첫번째 pop :" + stack.pop());
//        System.out.println("stack 두번째 pop :" + stack.pop());
//        System.out.println("stack 세번째 pop :" + stack.pop());

        Iterator<String> iterator = stack.iterator();;
        System.out.println("=== iterator 사용 FIFO ===");
        while(iterator.hasNext()){
            String result = (String)iterator.next();
            System.out.println(result);
        }

        System.out.println();

        System.out.println("=== pop() 사용 LIFO ===");
        int count = 1;
        while (!stack.isEmpty()) {
            System.out.println(count+"번째 pop() 결과 : "+stack.pop());
            System.out.println(count+"번째 pop() 이후 stack의 크기 : "+ stack.size());
            count++;
        }

        System.out.println();
        System.out.println("전체 pop() 이후 stack의 크기 : " + stack.size());
    }
}
