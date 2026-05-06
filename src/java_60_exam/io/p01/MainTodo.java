package java_60_exam.io.p01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: File 객체를 생성하고 경로를 출력하세요.
        /* java.io.file , java.nio.file 클래스 제공
           파일에 대한 정보를 File, Files 클래스에서 제공
           File 클래스는 File을 생성하는 클래스
           윈도우  \\, / 둘다 가능
           맥os, 리눅스  / 만 가능 \\ 는 오류
        */

        // File 객체 생성
        File dir = new File("C:/Temp/images");
        File file1 = new File("C:/Temp/testP01.txt");
        File file2 = new File("C:/Temp/testP01_2.txt");
        File file3 = new File("C:/Temp/testP01_3.txt");

        if(dir.exists() == false){ dir.mkdir(); }
        try {
            if (file1.exists() == false) file1.createNewFile();
            if (file2.exists() == false) file2.createNewFile();
            if (file3.exists() == false) file3.createNewFile();
        }catch (Exception e){

        }

        // c:/TEMP
        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File content : contents){
            System.out.printf("%-25s" , sdf.format(new Date(content.lastModified())));
            if(content.isDirectory()){
                System.out.printf("%-10s%-20s","<DIR>",content.getName());
            } else{
                System.out.printf("%-10s%-20s",content.length(),content.getName());
            }
            System.out.println();

            File file4 = new File("src/sample.txt");
            System.out.println(file4.getPath());
        }




        System.out.println( "파일의 경로 : "+ file1.getPath());
    }
}
