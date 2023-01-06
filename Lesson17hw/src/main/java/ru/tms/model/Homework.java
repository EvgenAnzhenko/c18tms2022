package ru.tms.model;

import lombok.Setter;
import ru.tms.service.IValue;

@Setter
public class Homework {
    private int firstValue;
    private String secondValue;

    void method(int count) {
        if (count == 1) {
            IValue<String> stringIValue = this::reverse;
            System.out.println(stringIValue.GetValue(secondValue));
        } else {
            IValue<Integer> integerIValue = this::getFactorial;
            System.out.println(integerIValue.GetValue(firstValue));
        }

    }

    String reverse(String str) {
        StringBuilder strResult = new StringBuilder(str);
        return strResult.reverse().toString();
    }

    int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

}
