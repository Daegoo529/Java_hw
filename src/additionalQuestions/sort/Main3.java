package additionalQuestions.sort;

import java.util.Arrays;
import java.util.Comparator;
// CompareTo (String) 이름순 정렬
public class Main3 {
    public static void main(String[] args) {

        class User {
            String name;
            int age;

            public  User(String name, int age){
                this.name = name;
                this.age = age;
            }
        }

        User[] users = {
                new User("홍길동",90)
                ,new User("김민수",30)
                ,new User("이길수",40)
        };

        Arrays.sort(
                users, new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.name.compareTo(o2.name);
                    }
                }
        );

        for(User user : users){
            System.out.println(user.name + " : " + user.age);
        }
    }
}
