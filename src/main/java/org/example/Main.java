package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> void main(String[] args) {
        List<T> list = (List) Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Сумма элементов списка: " + Calculator.sum(list));
        System.out.println("Произведение элементов списка: " + Multiplier.multiply(list));
        System.out.println("Деление элементов списка: " + Divider.divide(list));
        System.out.println("Бинарное представление элементов списка: " + BinaryConverter.toBinary(list));
    }
}

