package java_60_exam.io.p02;

import java.io.FileWriter;


public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileWriter로 test.txt에 "Java" 쓰기

        try {
            FileWriter wt = new FileWriter("C:/Temp/testP02.txt");
            wt.write("Java");
            wt.flush();

            // TODO 2: close 호출
            wt.close();
        }catch (Exception e){
            System.out.println( e.getMessage() );
        }


    }
}
