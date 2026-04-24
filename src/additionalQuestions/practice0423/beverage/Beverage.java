package additionalQuestions.practice0423.beverage;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name){
        this.name = name;
    }

    protected Beverage() {
    }

    public abstract void calcPrice();
    public void print(){
        System.out.println("판매 음료는 "+name+"이며, 가격은 "+price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
