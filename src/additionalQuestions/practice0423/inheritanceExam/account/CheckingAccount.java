package additionalQuestions.practice0423.inheritanceExam.account;

public class CheckingAccount extends Account{
    private String cardNo;


    public CheckingAccount(String accid, String ownerName,long balance, String cardNo){
        super(accid,ownerName,balance);
        this.cardNo = cardNo;
    }

    public void pay(String cardNo,long amount){
        if(cardNo.equals(getCardNo()) && amount < getBalance()){
            withdraw(amount);
        }else {
            System.out.println("지급이 불가능합니다.");
        }
    }

    @Override
    public void calcRate() {

    }

    public String getCardNo() {
        return cardNo;
    }
    public void setCardNo(String cardNo){
        this.cardNo = cardNo;
    }
}
