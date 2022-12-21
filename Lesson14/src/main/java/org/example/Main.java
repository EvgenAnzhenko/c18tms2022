package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("c.+?b");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            int first = matcher.start();
            int last = matcher.end();
            System.out.println(string.substring(first, last));
        }
        String string1 = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        Pattern pattern1 = Pattern.compile("[a-zA-z]+\\s+\\d+");
        matcher = pattern1.matcher(string1);
        while (matcher.find()) {
            int first = matcher.start();
            int last = matcher.end();
            System.out.println(string1.substring(first, last));
        }

        String string2 = "One two three раз два три one1 two2 123 ";
        int count = 0;
        String[] str = string2.split(" ");
        for (String arg : str) {
            if (arg.matches(("^[a-zA-Z]+$"))) {
                count++;
            }
        }
        System.out.println(count + " - количество слов из латинских букв");
    }

    public static boolean validate(String str) {
        if (str.length() >= 4 && str.length() <= 20 && str.matches("^[a-z15]+$")) {
            return true;
        }
        return false;
    }
}