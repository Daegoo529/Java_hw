package streamCodingTest.common;
public class Product {
    private final String sku, name; private final int price, stock;
    public Product(String sku, String name, int price, int stock){this.sku=sku;this.name=name;this.price=price;this.stock=stock;}
    public String getSku(){return sku;} public String getName(){return name;} public int getPrice(){return price;} public int getStock(){return stock;}
}
