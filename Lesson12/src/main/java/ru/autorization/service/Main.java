package ru.autorization.service;

import ru.autorization.exception.WrongLoginException;
import ru.autorization.exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            checkAuthorization("sdssdsddfd3", "545646", "545646");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean checkAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkLength(login) || !login.matches(("^[a-zA-Z0-9_]+$"))) {
            throw new WrongLoginException("Ошибка ввода Логина");
        } else if (!checkLength(password) || !login.matches(("^[a-zA-Z0-9_]+$")) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ошибка ввода пароля");
        }
        return true;
    }

    static private boolean checkLength(String parameter) {
        return parameter.length() < 20;
    }
}


