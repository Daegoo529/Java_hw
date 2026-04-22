package additionalQuestions.practice0422.payment_student;

public class CardPayment extends Payment{
    String cardNumber;
    String cardPassword;
    int monthlyInstallment;


    public CardPayment(String shopName,String productName,long productPrice,String cardNumber, String cardPassword, int monthlyInstallment){
        super();
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
        this.productName = productName;
        this.productPrice = productPrice;
        this.shopName = shopName;
    }

    @Override
    public void pay() throws PayException {
        super.pay();
        System.out.printf("[ 신용카드 결제 정보 ]\n상점명 : %s\n상품명 : %s\n상품가격 : %d\n신용카드번호 : %s\n할부개월 : %d",shopName,productName,productPrice,cardNumber,monthlyInstallment);
    }

    @Override
    public String toString(){
        return "가격이나 할부개월수가 잘못되었습니다.";
    }
}
