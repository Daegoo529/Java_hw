package additionalQuestions.practice0423.inheritanceExam.tv;

public class Tv {
    String color;
    boolean power;
    int channel;

    public Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power(){
        power = !power;
    }

    public void channelUp(){
        channel++;
    }

    public void channelDown(){
        channel--;
    }

    public void print(){
        System.out.println("color : "+color+"\tpower : "+power+"\tchannel : "+channel);
    }
}
