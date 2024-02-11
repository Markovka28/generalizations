package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryConverter {
    public static <T> List<T> toBinary(List<T> list) {
        List<T> binaryList = new ArrayList<>();
        for (T element : list) {
            binaryList.add(toBinary(element));
        }
        return binaryList;
    }

    static <T> T toBinary(T element) {
        if (element instanceof Integer) {
            return (T) Integer.toBinaryString((Integer) element);
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }
}
