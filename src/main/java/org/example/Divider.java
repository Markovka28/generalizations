package org.example;

import java.util.ArrayList;
import java.util.List;

public class Divider {
    public static <T> T divide(List<T> list) {
        T quotient = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            quotient = divide(quotient, list.get(i));
        }
        return quotient;
    }

    private static <T> T divide(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) (Integer) ((Integer) a / (Integer) b);
        } else if (a instanceof Double && b instanceof Double) {
            return (T) (Double) ((Double) a / (Double) b);
        } else {
            throw new IllegalArgumentException("Unsupported types");
        }
    }
}
