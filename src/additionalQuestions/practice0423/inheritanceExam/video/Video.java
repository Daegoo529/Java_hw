package additionalQuestions.practice0423.inheritanceExam.video;

public class Video extends Content{
    String genre;

    // title과 genre를 매개변수로 받는 생성자
    public Video(String title,String genre){
        super(title);
        this.genre = genre;
    }

    // genre getter,setter
    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    // genre의 값에 따라 가격을 셋팅
    public void totalPrice(){
        int price = switch(genre){
            case "new" -> 2000;
            case "comic" -> 1500;
            case "child" -> 1000;
            default -> 500;
        };
        setPrice(price);
    }
}
