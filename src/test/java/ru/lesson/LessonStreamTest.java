package ru.lesson;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class LessonStreamTest {

    private LessonStream lessonStream;

    @BeforeEach
    void setUp() {
        lessonStream = new LessonStream();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFruits() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        List<String> fruitsWithLe= lessonStream.getFruits(fruits);
        Assertions.assertEquals(fruit, fruitsWithLe);

    }

    @Test
    void getListOfNumbers() {
        List<Integer>numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> increasingNumbers = lessonStream.getListOfNumbers(numbers);

        List<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(2);
        expectedNumbers.add(3);
        expectedNumbers.add(4);
        Assertions.assertEquals(expectedNumbers, increasingNumbers);

    }

    @Test
    void mappingToList() {
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> expectedList = lessonStream.mappingToList(numbers);
        System.out.println(expectedList);


    }

    @Test
    void mappingToArray() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int[] numbers = lessonStream.mappingToArray(list);
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}