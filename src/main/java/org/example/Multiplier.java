package org.example;

import java.util.ArrayList;
import java.util.List;

public class Multiplier {
    public static <T> T multiply(List<T> list) {
        T product = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            product = multiply(product, list.get(i));
        }
        return product;
    }

    private static <T> T multiply(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) (Integer) ((Integer) a * (Integer) b);
        } else if (a instanceof Double && b instanceof Double) {
            return (T) (Double) ((Double) a * (Double) b);
        } else {
            throw new IllegalArgumentException("Unsupported types");
        }
    }
}
