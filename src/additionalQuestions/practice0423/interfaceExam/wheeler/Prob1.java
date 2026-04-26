package additionalQuestions.practice0423.interfaceExam.wheeler;

public class Prob1 {
    public static void main(String[] args) {
        int speed = 25;
        Truck truck = new Truck("트럭",0,4);
        Bike bike = new Bike("자전거",0,2);

        truck.wheelNum();
        bike.wheelNum();
        truck.speedUp(speed);
        bike.speedUp(speed);
        truck.speedDown(speed);
        bike.speedDown(speed);
        truck.stop();
        bike.stop();

        speed = 10;
        truck.speedUp(speed);

    }
}
