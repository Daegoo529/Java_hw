package basic_homework.ch06.sec07.exam05;


public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();

        String model = "";
        Car car2 = new Car(model);
        car2.model = "자가용";

        String color= "";
        Car car3 = new Car(model,color);
        car3.model = "자가용";
        car3.color = "빨강";

        int maxSpeed = 0;
        Car car4 = new Car(model,color,maxSpeed);
        car4.model = "택시";
        car4.color = "검정";
        car4.maxSpeed = 200;

        System.out.printf("car1.company : %s\n\n" , car1.company);
        System.out.printf("car2.company : %s\ncar2.model : %s\n\n" , car2.company,car2.model);
        System.out.printf("car3.company : %s\ncar3.model : %s\ncar3.color : %s\n\n",car3.company, car3.model, car3.color);
        System.out.printf("car4.company : %s\ncar4.model : %s\ncar4.color : %s\ncar4.maxSpeed : %d",car4.company, car4.model, car4.color, car4.maxSpeed);

    }
}
