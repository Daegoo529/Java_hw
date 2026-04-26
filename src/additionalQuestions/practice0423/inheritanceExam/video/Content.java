package additionalQuestions.practice0423.inheritanceExam.video;

public abstract class Content {
    String title;
    int price;

    // 기본생성자
    public Content(){}

    // title을 매개변수로 받는 생성자
    public Content(String title){
        this.title = title;
    }

    // void totalPrice()라는 abstract메소드
    public abstract void totalPrice();

    // title getter,setter
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    // price getter,setter
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public void show(){
        System.out.println(title+" 비디오의 가격은 "+price+"원 입니다");
    }




}
