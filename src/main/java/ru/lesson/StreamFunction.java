package ru.lesson;

import java.util.*;

public class StreamFunction {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User("Kira", 23, 4));
        list.add(new User("Olga", 56, 4));
        list.add(new User("Nata", 13, 4));
        list.add(new User("Gosha", 78, 4));

        int sum = list.stream().
                mapToInt(User::getAge)
                .sum();

        System.out.println(sum);

        OptionalDouble avarageBalance = list.stream()
                .map(user -> user.getBalance())
                .mapToDouble(Integer::intValue)
                .average();

        System.out.println(avarageBalance);


        int Min = list.stream()
                .mapToInt(User::getAge)
                .min().orElseThrow();

        System.out.println(Min);



    }
}