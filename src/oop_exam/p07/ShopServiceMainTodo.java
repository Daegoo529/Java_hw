package oop_exam.p07;

public class ShopServiceMainTodo {
    public static void main(String[] args) {
        // TODO 1: getInstance()를 이용해 obj1, obj2를 얻으세요.
        ShopServiceTodo obj1 = ShopServiceTodo.getInstance();
        ShopServiceTodo obj2 = ShopServiceTodo.getInstance();

        // TODO 2: 두 참조가 같으면 "같은 ShopService 객체입니다."를 출력하세요.
        if( obj1 == obj2){
            System.out.println("같은 ShopService 객체입니다.");
        }

        // TODO 3: 아니면 "다른 ShopService 객체입니다."를 출력하세요.
        else{
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
