package com.hw.main;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("Lesson15hw/src/main/java/hw1/input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("Lesson15hw/src/main/java/hw1/output.txt")) {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            String line = new String(bytes);
            String[] wordsFromLine = line.split("\r\n");
            for (String word : wordsFromLine) {
                if (checkPalindromes(word)) {
                    fileOutputStream.write(word.getBytes());
                    fileOutputStream.write(" ".getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkPalindromes(String string) {  // проверка полиндромов
        if (!string.matches("^[0-9]+$") && string.length() > 1 && string.equalsIgnoreCase(StringUtils.reverse(string))) {
            return true;
        }
        return false;
    }
}