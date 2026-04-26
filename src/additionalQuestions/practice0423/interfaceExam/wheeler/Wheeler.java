package additionalQuestions.practice0423.interfaceExam.wheeler;

public abstract class Wheeler {
    protected int velocity;
    protected String carName;
    protected int wheelNumber;

    abstract public void speedUp(int speed);

    abstract public void speedDown(int speed);

    abstract  public void wheelNum();

    public void stop(){
        velocity = 0;
        System.out.println("정지상태로 속도를 0으로 초기화합니다.");
    }
}
