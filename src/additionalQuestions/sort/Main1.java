package additionalQuestions.sort;

import java.util.Arrays;
import java.util.Collections;

// Comparable
public class Main1 {
    public static void main(String[] args) {
        class User implements Comparable<User>{
            String name;
            int age;

            public  User(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                if(this.age < o.age){
                    return -1;
                } else if (this.age == o.age) {
                    return 0;
                }else {
                    return 1;
                }
            }
        }

        User[] users = {
                new User("홍길동",90)
                ,new User("김민수",30)
                ,new User("이길수",40)
        };

        // sort 전
        System.out.println("==== sort 전 ----");
        for(User user : users){
            System.out.println(user.name + " => "+user.age);
        }


        // 나이순으로 user 정렬하여 출력
        System.out.println("==== sort 후 ====");
        Arrays.sort(users);
        for(User user : users){
            System.out.println(user.name + " => "+user.age);
        }

        System.out.println("역순 sorting 후 =========== ");

        Arrays.sort(users, Collections.reverseOrder());

        for (User user1 : users) {
            System.out.println(user1.name + " => " + user1.age);

        }
    }
}
