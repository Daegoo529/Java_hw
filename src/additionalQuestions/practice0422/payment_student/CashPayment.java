package additionalQuestions.practice0422.payment_student;

public class CashPayment extends Payment{
    String cashReceipNumber;

    public CashPayment(String shopName,String productName,long priductPrice,String cashReceipNumber){
        super();
        this.cashReceipNumber = cashReceipNumber;
        this.productName = productName;
        this.productPrice = priductPrice;
        this.shopName = shopName;

    }

    @Override
    public void pay() throws PayException {
        super.pay();
        System.out.printf("[ 현금 결제 정보 ]\n상점명 : %s\n상품명 : %s\n상품가격 : %d\n현금영수증번호 : %s",shopName,productName,productPrice,cashReceipNumber);
    }

    @Override
    public String toString(){
        return "가격이 잘못되었습니다.";
    }
}
