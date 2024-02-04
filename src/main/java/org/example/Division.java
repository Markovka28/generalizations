package org.example;

public class Division {
    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
}
