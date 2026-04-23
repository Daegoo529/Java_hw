package additionalQuestions.practice0423.book;

public class BookMgr {
    // todo1
    Book[] booklist;

    // todo2
    public BookMgr(){

    }
    public BookMgr(Book[] booklist){
        this.booklist = booklist;
    }

    // todo3
    public void printBooklist(){
        for(int i=0; i<booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }
    }

    // todo4
    public void printTotalPrice(){
        int total = 0;
        for(int i=0; i<booklist.length; i++) {
            total += booklist[i].getPrice();

        }
        System.out.println("전체 책 가격의 합 : "+total);
    }


}
