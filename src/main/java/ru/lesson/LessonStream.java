package ru.lesson;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
@Data
@AllArgsConstructor
public class LessonStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("lemon");
        list.add("orange");
        list.add("pear");
        list.add("pineapple");
        list.add("banana");

        System.out.println(getFruits(list));


        int[] arrayNumber = {4268, 1203, 4691, 4720, 2295, 2422, 415, 627, 139, 3513, 960, 4505, 480, 23, 4301, 1912, 2957, 2069};

        int[] arrayNumber1 = {2443, 1912, 3208, 20, 2078, 1246, 925, 3173, 3441, 529, 2332, 1398, 3623, 38, 2584};


        List<Integer>integerList1=mappingToList(arrayNumber1);

        getListOfNumbers(integerList1).forEach(System.out::println);

        int[]arrayNumbers3=mappingToArray(integerList1);

        System.out.println(integerList1);

        System.out.println(Arrays.toString(arrayNumbers3));


    }

    public static List<String> getFruits(List<String> list) {
        List<String> fruits = list.stream()
                .filter(s -> s.contains("le"))
                .toList();
        return fruits;
    }

    public static List<Integer> getListOfNumbers(List<Integer> list) {

        List<Integer> collect = list.stream()
                .map(n->n+1)
                .toList();

        return collect;
    }

    public static List<Integer> mappingToList(int[] arrayNumbers) {
        return Arrays.stream(arrayNumbers)
                .boxed()
                .toList();

    }


    public static int[] mappingToArray(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

}