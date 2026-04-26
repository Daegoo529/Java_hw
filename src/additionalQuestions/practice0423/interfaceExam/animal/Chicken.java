package additionalQuestions.practice0423.interfaceExam.animal;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance +=  (double)(speed * hours);
    }

    @Override
    public void fly() {
        speed = 2 * speed;
    }
}
