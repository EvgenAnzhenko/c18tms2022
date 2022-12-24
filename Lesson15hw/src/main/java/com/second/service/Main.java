package com.second.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("Lesson15hw/src/main/java/hw2/input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("Lesson15hw/src/main/java/hw2/output.txt")) {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            String result = new String(bytes);
            result = result.replaceAll("[\\-\\r\\n]", ""); //
            String[] strings = result.split("[\\.\\!\\?]");
            TextFormatter textFormatter = new TextFormatter();
            for (String string : strings) {
                if (textFormatter.getCountWordsInSentence(string.trim()) >= 3 && textFormatter.getCountWordsInSentence(string.trim()) <= 5 ||
                        textFormatter.checkPalindromes(string.trim())) {
                    fileOutputStream.write(string.trim().getBytes());
                    fileOutputStream.write(".\r".getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}