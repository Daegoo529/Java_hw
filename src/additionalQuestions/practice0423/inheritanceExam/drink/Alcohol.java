package additionalQuestions.practice0423.inheritanceExam.drink;

public class Alcohol extends Drink{
    double alcper;

    public Alcohol(String name, int price, int count) {
        super(name, price, count);
    }
    public Alcohol(String name, int price, int count,double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    @Override
    public void printData() {
        System.out.println(name+"("+alcper+")\t\t"+price+"\t"+count+"\t\t"+getTotalPrice());
    }

    @Override
    public void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }
}
