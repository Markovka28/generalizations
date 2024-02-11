package org.example;

import java.util.List;

public class Calculator {
    public static <T> int sum(List<T> list) {
        int sum = 0;
        for (T element : list) {
            sum += (int) element;
        }
        return sum;
    }

    public static <List> String sum(List list) {
        return null;
    }
}

