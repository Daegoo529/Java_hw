package java_60_exam.collection.p09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    StudentTodo(){

    }

    StudentTodo(String name,int score){
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        List<StudentTodo> list = new ArrayList<>();

        // TODO 3: 객체 3개 추가
        list.add(new StudentTodo("김첫째",90));
        list.add(new StudentTodo("김둘째",85));
        list.add(new StudentTodo("김막내",99));

        // TODO 4: 평균 점수 출력
        int sum = 0;
        double avg = 0.0;
        for( StudentTodo st : list){
            sum += st.score;
        }
        avg = (double)sum / list.size();

        // iterator 사용
        int sum1 = 0;
        double avg1 = 0.0;
        int size = list.size();
        Iterator<StudentTodo> iterator = list.iterator();
        while(iterator.hasNext()){
            StudentTodo st = iterator.next();
            sum1 += st.score;
        }
        avg1 = (double)sum1 / size;

        System.out.printf("평균 : %.2f\n" , avg);
        System.out.printf("평균 : %.2f", avg1);
    }
}
