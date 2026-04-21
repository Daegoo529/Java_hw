package basic_homework.ch06.sec08.exam02;

public class Computer {

    public Computer(){}
    public int sum(int num1,int num2, int num3){
        return num1+num2+num3;
    }
    public int sum(int num1, int num2, int num3, int num4, int num5){
        return num1+num2+num3+num4+num5;
    }
    public int sum(int[] values){
        int result = 0;
        for(int i=0; i<values.length; i++){
            result += values[i];
        }
        return result;
    }

}
