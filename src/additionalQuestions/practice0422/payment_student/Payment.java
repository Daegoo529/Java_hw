package additionalQuestions.practice0422.payment_student;

public class Payment implements Payable{
    String shopName;
    String productName;
    long productPrice;

    public Payment() {
        super();
    }

    @Override
    public void pay() throws PayException {

    }

    public Payment(String shopName,String productName,long productPrice){
        super();
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

}
