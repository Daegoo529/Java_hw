package additionalQuestions.practice0423.interfaceExam.factory;

public abstract class Factory {
    int openHour;   // 공장가동시각 h
    int closeHour;  // 공장종료시각 h
    String name;    // 공장 이름

    Factory(String name, int openHour, int closeHour){
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName(){
        return this.name;
    }

    int getWorkingTime(){
        return this.closeHour - this.openHour;
    }

    abstract int makeProducts(char skill);
}

