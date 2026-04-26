package additionalQuestions.practice0423.interfaceExam.animal;

public class Dog extends Animal{

    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance += (double)(speed * hours) / 2;
    }
}
