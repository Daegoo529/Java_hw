package additionalQuestions.practice0423.interfaceExam.factory;

public class CarFactory extends Factory implements IWorkingTogether{

    CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        int result = switch(skill){
            case 'A' -> 3;
            case 'B' -> 2;
            case 'C' -> 1;
            default -> 0;
        };
        return result * getWorkingTime() ;
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('B');
    }
}
