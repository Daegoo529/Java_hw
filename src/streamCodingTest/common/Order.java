package streamCodingTest.common;
public class Order {
    private final String orderId, customerId, category, status;
    private final int amount;
    public Order(String orderId, String customerId, String category, int amount, String status) {
        this.orderId=orderId; this.customerId=customerId; this.category=category; this.amount=amount; this.status=status;
    }
    public String getOrderId(){return orderId;} public String getCustomerId(){return customerId;}
    public String getCategory(){return category;} public int getAmount(){return amount;} public String getStatus(){return status;}
    public String toString(){return orderId+":"+customerId+":"+category+":"+amount+":"+status;}
}
