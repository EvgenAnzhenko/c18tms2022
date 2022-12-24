package com.censorship.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("Lesson15hw/src/main/java/com/censorship/utils/input.txt");
             FileInputStream fileInputStream1 = new FileInputStream("Lesson15hw/src/main/java/com/censorship/utils/blacklist.txt")
        ) {
            byte[] bytesInputText = new byte[fileInputStream.available()];
            byte[] bytesBlacklist = new byte[fileInputStream1.available()];
            fileInputStream.read(bytesInputText);
            fileInputStream1.read(bytesBlacklist);
            String[] sentences = new String(bytesInputText).split("\\.(\r\n)|(\\.\\s)|\\.");
            String[] blackListWords = new String(bytesBlacklist).split("\\r\\n");

            printResult(checkEqualsBlackListWord(blackListWords, sentences));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static ArrayList<String> checkEqualsBlackListWord(String[] blackListWords, String[] sentences) {
        ArrayList<String> sentencesWithBlackListWords = new ArrayList<>();
        start:
        for (String sentence : sentences) {
            String[] wordsOfSentences = sentence.split("\\s");
            for (String wordsOfSentence : wordsOfSentences) {
                for (String blackListWord : blackListWords) {
                    if (wordsOfSentence.equalsIgnoreCase(blackListWord)) {
                        sentencesWithBlackListWords.add(sentence);
                        continue start;
                    }
                }
            }
        }
        return sentencesWithBlackListWords;
    }

    static void printResult(ArrayList<String> strings) {
        if (strings.size() > 0) {
            System.out.println("Количество предложений со словами из black list: " + strings.size() + "\n" + strings);

        } else {
            System.out.println("Текст прошел проверку на цензуру");
        }
    }
}

