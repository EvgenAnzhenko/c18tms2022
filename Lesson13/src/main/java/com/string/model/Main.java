package com.string.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "Первое А и аапоследнеев В";
        String str1 = str.substring(str.indexOf('А') + 1, str.lastIndexOf('В'));  //Задача 1 Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
        System.out.println("Вырезал от А до В не включая последнее В (" + str1 + ")");
        String str2 = str.replace(str.charAt(3), str.charAt(0));       //Задача 2 Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
        System.out.println("Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0 (" + str2 + ")");
        String[] strings = {"довод", "доход", "заказ", "авто"};
        System.out.println(getPalindromes(strings));                                      // Задача 3 Вывод на экран палидромов
        String string = "Есть строка в которой содержится текст.Предложения разделены точками.довод запуска.";
        System.out.println(getSentencesThreeOreFiveWordsOrPalindromes(string)); // задача 4
        String str5 = "string";
        String str51 = "Practice";                      // Задача 5
        System.out.println(getMiddleLetters(str5));
        System.out.println(getMiddleLetters(str51));
        String str6 = "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)";
        System.out.println(getAmountWordsOfLatinAlphabet(str6));
    }

    private static String getMiddleLetters(String string) {
        return String.valueOf(string.charAt(string.length() / 2 - 1)) + String.valueOf(string.charAt(string.length() / 2));
    }

    private static ArrayList<String> getSentencesThreeOreFiveWordsOrPalindromes(String string) {
        ArrayList<String> resultSentence = new ArrayList<>();
        String[] sentences = string.split("\\.");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            if (words.length >= 3 && words.length <= 5 || checkPalindromes(words)) {
                resultSentence.add(String.join(" ", words));
            }
        }
        return resultSentence;
    }

    private static boolean checkPalindromes(String[] strings) {  // проверка полиндромов
        for (String string : strings) {
            if (string.length() > 1 && string.equals(StringUtils.reverse(string))) {
                return true;
            }
        }
        return false;
    }

    private static ArrayList<String> getPalindromes(String[] strings) {// Проверяет палиндромы
        ArrayList<String> palindromesList = new ArrayList<>();
        for (String string : strings) {
            if (string.equals(StringUtils.reverse(string))) {
                palindromesList.add(string);
            }
        }
        return palindromesList;
    }

    private static int getAmountWordsOfLatinAlphabet(String string) {
        int count = 0;
        String[] words = string.split(" ");
        for (String wordForCheck : words) {
            if (wordForCheck.matches(("^[a-zA-Z]+$"))) {
                count++;
            }
        }
        return count;
    }
}
