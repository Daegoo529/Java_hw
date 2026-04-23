package additionalQuestions.practice0423.book;

public class Book {
    // todo1,2
    private String title;
    private int price;

    // todo3
    public Book(){}
    public Book(String title , int price){
        this.title = title;
        this.price = price;
    }

    // todo4,5
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }




}
