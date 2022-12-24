package com.second.service;

import org.apache.commons.lang3.StringUtils;

public class TextFormatter {
    int getCountWordsInSentence(String string) {
        String[] strings = string.split(" ");
        return strings.length;
    }

    boolean checkPalindromes(String string) {
        if (!string.matches("^[0-9]+$") && string.length() > 1 && string.equalsIgnoreCase(StringUtils.reverse(string))) {
            return true;
        }
        return false;
    }
}
