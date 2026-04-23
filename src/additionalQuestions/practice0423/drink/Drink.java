package additionalQuestions.practice0423.drink;

public class Drink {
    String name;
    int price;
    int count;

    public Drink(String name, int price, int count){
        super();
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice(){
        int totalPrice = 0;
        totalPrice = price * count;
        return totalPrice;
    }

    public void printTitle(){
        System.out.println("상품명\t단가\t\t수량\t\t금액");
    }

    public void printData(){
        System.out.println(name+"\t\t"+price+"\t"+count+"\t\t"+getTotalPrice());
    }

}
