package basic_homework.ch06.sec08.exam01;


public class Calculator {


    public Calculator(){};

    public int plus(int x, int y) {
        return x+y;
    }

    public double devide(int x, int y){
        return (double)x/y;
    }
    public void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }
}
