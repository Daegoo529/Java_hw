package oop_exam.p02;

public class MemberTodo {
    String name;
    String id;
    String password;
    int age;

    // TODO 1: name, id, password, age를 매개값으로 받는 생성자를 작성하세요.
    // TODO 2: 생성자 안에서 this를 사용해 필드를 초기화하세요.
    MemberTodo(String name, String id, String password, int age){
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // TODO 3: showProfile() 메소드를 작성하세요.
    // 출력 형식:
    // 이름: 홍길동
    // 아이디: hong
    // 비밀번호: 12345
    // 나이: 25
    void showProfile(){
        System.out.println("이름 : "+this.name+"\n아이디 : "+this.id+"\n비밀번호 : "+this.password+"\n나이 : "+this.age);
    }
}
