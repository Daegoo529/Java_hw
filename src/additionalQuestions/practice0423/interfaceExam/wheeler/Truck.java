package additionalQuestions.practice0423.interfaceExam.wheeler;

public class Truck extends Wheeler{


    Truck(String carName,int velocity){

    }

    Truck(String carName, int velocity, int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity +=  5 * speed;
        if(this.velocity > 100){
            this.velocity = 100;
        }
        System.out.println("트럭의 현재 속도는 " + this.velocity + " 입니다.");
    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= 5 * speed;
        if(this.velocity < 50){
            this.velocity = 50;
        }
        System.out.println("트럭의 최저속도위반으로 속도를 "+velocity+"으로 올립니다.");
//        else if(this.velocity == 0 ){
//            System.out.println();
//        }


    }

    @Override
    public void wheelNum() {
        System.out.println(this.carName + " : 바퀴 " + this.wheelNumber+"개 입니다.");
    }
}
