package additionalQuestions.sort;

import java.util.Arrays;
import java.util.Comparator;

// 나이순 정렬 했는데, 나이가 같은 사람이 있을 경우 추가적인 이름순 정렬
// 객체의 여러 속성을 이용하여 정렬하기 위해 Comparator 의
// compare(), thenComparing() 이용한 체이닝 구현이 가능하다.
// 객체의 속성을 이용시 setter/getter 가 필요하다
public class Main4 {
    public static void main(String[] args) {

        class User {
            private String name;

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            private int age;

            public  User(String name, int age){
                this.name = name;
                this.age = age;
            }
        }

        User[] users = {
                new User("홍길동",20)
                ,new User("김민수",20)
                ,new User("이길수",30)
                ,new User("차준성",20)
                ,new User("이미리",30)
        };
        // 나이순 정렬
        Arrays.sort(
                users, Comparator.comparing(User::getAge)
        );

        for(User user : users){
            System.out.println(user.name + " : " + user.age);
        }

        System.out.println("\n");
        // 이름순 정렬
        Arrays.sort(
                users, Comparator.comparing(User::getName)
        );

        for(User user : users){
            System.out.println(user.name + " : " + user.age);
        }
        System.out.println("\n");
        // 나이순 -> 이름순 정렬
        Arrays.sort(
                users ,Comparator.comparing(User::getAge).thenComparing(User::getName)
        );
        for(User user : users){
            System.out.println(user.name + " : " + user.age);
        }
    }
}
