package basic_homework.ch06.sec07.exam05;

public class Car {
    // 필드선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car( String model){

    }
    Car(String model, String color){

    }
    Car(String model , String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car() {

    }
}
