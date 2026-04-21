package basic_homework.ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        // Korean 객체 생성
        Korean k1 = new Korean();
        k1.name = "박자바";
        k1.ssn = "011225-1234567";

        Korean k2 = new Korean();
        k2.name = "김자바";
        k2.ssn = "930525-0654321";

        System.out.printf("k1.nation : %s\nk1.name : %s\nk1.ssn : %s\n\n",k1.nation,k1.name,k1.ssn);
        System.out.printf("k2.nation : %s\nk2.name : %s\nk2.ssn : %s",k2.nation,k2.name,k2.ssn);

    }
}
