package additionalQuestions.practice0423.inheritanceExam.beverage;

public class Coffee extends Beverage{
    public static int amount;

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "Americano" : setPrice(1500); break;
            case "CafeLatte" : setPrice(2500); break;
            case "Cappuccino" : setPrice(3000); break;
            default:
                System.out.println("해당 커피가 없습니다.");
        }
    }

    public Coffee(String name){
        super(name);
        amount++;
    }



}
