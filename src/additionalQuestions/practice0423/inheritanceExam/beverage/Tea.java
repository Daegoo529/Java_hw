package additionalQuestions.practice0423.inheritanceExam.beverage;

public class Tea extends Beverage{
    public static int amount;

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "lemonTea" : setPrice(1500); break;
            case "ginsengTea" : setPrice(2000); break;
            case "redginsengTea" : setPrice(2500); break;
            default:
                System.out.println("해당 티가 없습니다.");
        }
    }


    public Tea(String name){
        super(name);
        amount++;
    }
}
