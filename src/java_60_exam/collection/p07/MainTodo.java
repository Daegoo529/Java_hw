package java_60_exam.collection.p07;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Queue<String> 생성
        Queue<String> queue = new LinkedList<>();

        // TODO 2: offer로 3개 추가
        queue.offer("첫번째");
        queue.offer("두번째");
        queue.offer("세번째");

        // TODO 3: poll 하며 출력
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
