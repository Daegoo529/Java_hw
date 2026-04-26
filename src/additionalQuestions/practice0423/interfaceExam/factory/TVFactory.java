package additionalQuestions.practice0423.interfaceExam.factory;

public class TVFactory extends Factory implements IWorkingTogether{

    TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        int result = switch(skill){
            case 'A' -> 8;
            case 'B' -> 5;
            case 'C' -> 3;
            default -> 1;
        };
        return result * getWorkingTime() ;
    }

    @Override
    public int workTogether(IWorkingTogether partner) {

        return makeProducts('C');
    }
}
