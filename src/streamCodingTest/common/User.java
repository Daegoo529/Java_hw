package streamCodingTest.common;
public class User {
    private final String id, name; private final int age; private final boolean active;
    public User(String id, String name, int age, boolean active){this.id=id;this.name=name;this.age=age;this.active=active;}
    public String getId(){return id;} public String getName(){return name;} public int getAge(){return age;} public boolean isActive(){return active;}
}
